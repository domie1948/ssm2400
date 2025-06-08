package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaoshoufeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaoshoufeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoshoufeiView;


/**
 * 挂号收费
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface GuahaoshoufeiService extends IService<GuahaoshoufeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoshoufeiVO> selectListVO(Wrapper<GuahaoshoufeiEntity> wrapper);
   	
   	GuahaoshoufeiVO selectVO(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
   	
   	List<GuahaoshoufeiView> selectListView(Wrapper<GuahaoshoufeiEntity> wrapper);
   	
   	GuahaoshoufeiView selectView(@Param("ew") Wrapper<GuahaoshoufeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoshoufeiEntity> wrapper);
   	
}

