package com.dao;

import com.entity.GuahaoshoufeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaoshoufeiVO;
import com.entity.view.GuahaoshoufeiView;


/**
 * 挂号收费
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface GuahaoshoufeiDao extends BaseMapper<GuahaoshoufeiEntity> {
	
	List<GuahaoshoufeiVO> selectListVO(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
	
	GuahaoshoufeiVO selectVO(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
	
	List<GuahaoshoufeiView> selectListView(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);

	List<GuahaoshoufeiView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
	
	GuahaoshoufeiView selectView(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
	
}
