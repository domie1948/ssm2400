package com.dao;

import com.entity.PingguzhenduanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingguzhenduanVO;
import com.entity.view.PingguzhenduanView;


/**
 * 评估诊断
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface PingguzhenduanDao extends BaseMapper<PingguzhenduanEntity> {
	
	List<PingguzhenduanVO> selectListVO(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
	
	PingguzhenduanVO selectVO(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
	
	List<PingguzhenduanView> selectListView(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);

	List<PingguzhenduanView> selectListView(Pagination page,@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
	
	PingguzhenduanView selectView(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
	
}
