package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaofangguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaofangguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangguanliView;


/**
 * 药房管理
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface YaofangguanliService extends IService<YaofangguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaofangguanliVO> selectListVO(Wrapper<YaofangguanliEntity> wrapper);
   	
   	YaofangguanliVO selectVO(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
   	
   	List<YaofangguanliView> selectListView(Wrapper<YaofangguanliEntity> wrapper);
   	
   	YaofangguanliView selectView(@Param("ew") Wrapper<YaofangguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaofangguanliEntity> wrapper);
   	
}

