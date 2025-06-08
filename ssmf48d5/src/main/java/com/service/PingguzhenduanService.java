package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingguzhenduanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingguzhenduanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingguzhenduanView;


/**
 * 评估诊断
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface PingguzhenduanService extends IService<PingguzhenduanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingguzhenduanVO> selectListVO(Wrapper<PingguzhenduanEntity> wrapper);
   	
   	PingguzhenduanVO selectVO(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
   	
   	List<PingguzhenduanView> selectListView(Wrapper<PingguzhenduanEntity> wrapper);
   	
   	PingguzhenduanView selectView(@Param("ew") Wrapper<PingguzhenduanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingguzhenduanEntity> wrapper);
   	
}

