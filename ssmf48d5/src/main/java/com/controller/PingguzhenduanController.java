package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PingguzhenduanEntity;
import com.entity.view.PingguzhenduanView;

import com.service.PingguzhenduanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 评估诊断
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@RestController
@RequestMapping("/pingguzhenduan")
public class PingguzhenduanController {
    @Autowired
    private PingguzhenduanService pingguzhenduanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PingguzhenduanEntity pingguzhenduan, 
		HttpServletRequest request){

        EntityWrapper<PingguzhenduanEntity> ew = new EntityWrapper<PingguzhenduanEntity>();
		PageUtils page = pingguzhenduanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pingguzhenduan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PingguzhenduanEntity pingguzhenduan, HttpServletRequest request){
        EntityWrapper<PingguzhenduanEntity> ew = new EntityWrapper<PingguzhenduanEntity>();
		PageUtils page = pingguzhenduanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pingguzhenduan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PingguzhenduanEntity pingguzhenduan){
       	EntityWrapper<PingguzhenduanEntity> ew = new EntityWrapper<PingguzhenduanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pingguzhenduan, "pingguzhenduan")); 
        return R.ok().put("data", pingguzhenduanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PingguzhenduanEntity pingguzhenduan){
        EntityWrapper< PingguzhenduanEntity> ew = new EntityWrapper< PingguzhenduanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pingguzhenduan, "pingguzhenduan")); 
		PingguzhenduanView pingguzhenduanView =  pingguzhenduanService.selectView(ew);
		return R.ok("查询评估诊断成功").put("data", pingguzhenduanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PingguzhenduanEntity pingguzhenduan = pingguzhenduanService.selectById(id);
        return R.ok().put("data", pingguzhenduan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PingguzhenduanEntity pingguzhenduan = pingguzhenduanService.selectById(id);
        return R.ok().put("data", pingguzhenduan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PingguzhenduanEntity pingguzhenduan, HttpServletRequest request){
    	pingguzhenduan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pingguzhenduan);

        pingguzhenduanService.insert(pingguzhenduan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PingguzhenduanEntity pingguzhenduan, HttpServletRequest request){
    	pingguzhenduan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pingguzhenduan);

        pingguzhenduanService.insert(pingguzhenduan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PingguzhenduanEntity pingguzhenduan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pingguzhenduan);
        pingguzhenduanService.updateById(pingguzhenduan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pingguzhenduanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PingguzhenduanEntity> wrapper = new EntityWrapper<PingguzhenduanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = pingguzhenduanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
