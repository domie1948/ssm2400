package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PingguzhenduanDao;
import com.entity.PingguzhenduanEntity;
import com.service.PingguzhenduanService;
import com.entity.vo.PingguzhenduanVO;
import com.entity.view.PingguzhenduanView;

@Service("pingguzhenduanService")
public class PingguzhenduanServiceImpl extends ServiceImpl<PingguzhenduanDao, PingguzhenduanEntity> implements PingguzhenduanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingguzhenduanEntity> page = this.selectPage(
                new Query<PingguzhenduanEntity>(params).getPage(),
                new EntityWrapper<PingguzhenduanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingguzhenduanEntity> wrapper) {
		  Page<PingguzhenduanView> page =new Query<PingguzhenduanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingguzhenduanVO> selectListVO(Wrapper<PingguzhenduanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingguzhenduanVO selectVO(Wrapper<PingguzhenduanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingguzhenduanView> selectListView(Wrapper<PingguzhenduanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingguzhenduanView selectView(Wrapper<PingguzhenduanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
