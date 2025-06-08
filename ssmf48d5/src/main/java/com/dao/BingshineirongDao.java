package com.dao;

import com.entity.BingshineirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingshineirongVO;
import com.entity.view.BingshineirongView;


/**
 * 病史内容
 * 
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface BingshineirongDao extends BaseMapper<BingshineirongEntity> {
	
	List<BingshineirongVO> selectListVO(@Param("ew") Wrapper<BingshineirongEntity> wrapper);
	
	BingshineirongVO selectVO(@Param("ew") Wrapper<BingshineirongEntity> wrapper);
	
	List<BingshineirongView> selectListView(@Param("ew") Wrapper<BingshineirongEntity> wrapper);

	List<BingshineirongView> selectListView(Pagination page,@Param("ew") Wrapper<BingshineirongEntity> wrapper);
	
	BingshineirongView selectView(@Param("ew") Wrapper<BingshineirongEntity> wrapper);
	
}
