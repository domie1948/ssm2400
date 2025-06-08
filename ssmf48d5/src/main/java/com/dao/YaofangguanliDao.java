package com.dao;

import com.entity.YaofangguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaofangguanliVO;
import com.entity.view.YaofangguanliView;


/**
 * 药房管理
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface YaofangguanliDao extends BaseMapper<YaofangguanliEntity> {
	
	List<YaofangguanliVO> selectListVO(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
	
	YaofangguanliVO selectVO(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
	
	List<YaofangguanliView> selectListView(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);

	List<YaofangguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
	
	YaofangguanliView selectView(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
	
}
