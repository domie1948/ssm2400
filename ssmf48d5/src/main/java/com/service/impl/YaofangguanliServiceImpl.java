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


import com.dao.YaofangguanliDao;
import com.entity.YaofangguanliEntity;
import com.service.YaofangguanliService;
import com.entity.vo.YaofangguanliVO;
import com.entity.view.YaofangguanliView;

@Service("yaofangguanliService")
public class YaofangguanliServiceImpl extends ServiceImpl<YaofangguanliDao, YaofangguanliEntity> implements YaofangguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaofangguanliEntity> page = this.selectPage(
                new Query<YaofangguanliEntity>(params).getPage(),
                new EntityWrapper<YaofangguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaofangguanliEntity> wrapper) {
		  Page<YaofangguanliView> page =new Query<YaofangguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaofangguanliVO> selectListVO(Wrapper<YaofangguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaofangguanliVO selectVO(Wrapper<YaofangguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaofangguanliView> selectListView(Wrapper<YaofangguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaofangguanliView selectView(Wrapper<YaofangguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
