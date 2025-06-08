package com.dao;

import com.entity.JianchajijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianchajijieguoVO;
import com.entity.view.JianchajijieguoView;


/**
 * 检查及结果
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface JianchajijieguoDao extends BaseMapper<JianchajijieguoEntity> {
	
	List<JianchajijieguoVO> selectListVO(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
	
	JianchajijieguoVO selectVO(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
	
	List<JianchajijieguoView> selectListView(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);

	List<JianchajijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
	
	JianchajijieguoView selectView(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
	
}
