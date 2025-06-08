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


import com.dao.GuahaoshoufeiDao;
import com.entity.GuahaoshoufeiEntity;
import com.service.GuahaoshoufeiService;
import com.entity.vo.GuahaoshoufeiVO;
import com.entity.view.GuahaoshoufeiView;

@Service("guahaoshoufeiService")
public class GuahaoshoufeiServiceImpl extends ServiceImpl<GuahaoshoufeiDao, GuahaoshoufeiEntity> implements GuahaoshoufeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoshoufeiEntity> page = this.selectPage(
                new Query<GuahaoshoufeiEntity>(params).getPage(),
                new EntityWrapper<GuahaoshoufeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoshoufeiEntity> wrapper) {
		  Page<GuahaoshoufeiView> page =new Query<GuahaoshoufeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaoshoufeiVO> selectListVO(Wrapper<GuahaoshoufeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaoshoufeiVO selectVO(Wrapper<GuahaoshoufeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaoshoufeiView> selectListView(Wrapper<GuahaoshoufeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoshoufeiView selectView(Wrapper<GuahaoshoufeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
