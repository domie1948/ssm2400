package com.dao;

import com.entity.JianyihezhuyishixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianyihezhuyishixiangVO;
import com.entity.view.JianyihezhuyishixiangView;


/**
 * 建议和注意事项
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface JianyihezhuyishixiangDao extends BaseMapper<JianyihezhuyishixiangEntity> {
	
	List<JianyihezhuyishixiangVO> selectListVO(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
	
	JianyihezhuyishixiangVO selectVO(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
	
	List<JianyihezhuyishixiangView> selectListView(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);

	List<JianyihezhuyishixiangView> selectListView(Pagination page,@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
	
	JianyihezhuyishixiangView selectView(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
	
}
