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


import com.dao.JianyihezhuyishixiangDao;
import com.entity.JianyihezhuyishixiangEntity;
import com.service.JianyihezhuyishixiangService;
import com.entity.vo.JianyihezhuyishixiangVO;
import com.entity.view.JianyihezhuyishixiangView;

@Service("jianyihezhuyishixiangService")
public class JianyihezhuyishixiangServiceImpl extends ServiceImpl<JianyihezhuyishixiangDao, JianyihezhuyishixiangEntity> implements JianyihezhuyishixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianyihezhuyishixiangEntity> page = this.selectPage(
                new Query<JianyihezhuyishixiangEntity>(params).getPage(),
                new EntityWrapper<JianyihezhuyishixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianyihezhuyishixiangEntity> wrapper) {
		  Page<JianyihezhuyishixiangView> page =new Query<JianyihezhuyishixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianyihezhuyishixiangVO> selectListVO(Wrapper<JianyihezhuyishixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianyihezhuyishixiangVO selectVO(Wrapper<JianyihezhuyishixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianyihezhuyishixiangView> selectListView(Wrapper<JianyihezhuyishixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianyihezhuyishixiangView selectView(Wrapper<JianyihezhuyishixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
