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


import com.dao.JianchajijieguoDao;
import com.entity.JianchajijieguoEntity;
import com.service.JianchajijieguoService;
import com.entity.vo.JianchajijieguoVO;
import com.entity.view.JianchajijieguoView;

@Service("jianchajijieguoService")
public class JianchajijieguoServiceImpl extends ServiceImpl<JianchajijieguoDao, JianchajijieguoEntity> implements JianchajijieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianchajijieguoEntity> page = this.selectPage(
                new Query<JianchajijieguoEntity>(params).getPage(),
                new EntityWrapper<JianchajijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianchajijieguoEntity> wrapper) {
		  Page<JianchajijieguoView> page =new Query<JianchajijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianchajijieguoVO> selectListVO(Wrapper<JianchajijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianchajijieguoVO selectVO(Wrapper<JianchajijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianchajijieguoView> selectListView(Wrapper<JianchajijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianchajijieguoView selectView(Wrapper<JianchajijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
