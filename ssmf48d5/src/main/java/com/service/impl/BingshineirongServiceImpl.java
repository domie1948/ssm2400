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


import com.dao.BingshineirongDao;
import com.entity.BingshineirongEntity;
import com.service.BingshineirongService;
import com.entity.vo.BingshineirongVO;
import com.entity.view.BingshineirongView;

@Service("bingshineirongService")
public class BingshineirongServiceImpl extends ServiceImpl<BingshineirongDao, BingshineirongEntity> implements BingshineirongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingshineirongEntity> page = this.selectPage(
                new Query<BingshineirongEntity>(params).getPage(),
                new EntityWrapper<BingshineirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingshineirongEntity> wrapper) {
		  Page<BingshineirongView> page =new Query<BingshineirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingshineirongVO> selectListVO(Wrapper<BingshineirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingshineirongVO selectVO(Wrapper<BingshineirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingshineirongView> selectListView(Wrapper<BingshineirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingshineirongView selectView(Wrapper<BingshineirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
