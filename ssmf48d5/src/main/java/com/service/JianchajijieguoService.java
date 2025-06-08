package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianchajijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianchajijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianchajijieguoView;


/**
 * 检查及结果
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface JianchajijieguoService extends IService<JianchajijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianchajijieguoVO> selectListVO(Wrapper<JianchajijieguoEntity> wrapper);
   	
   	JianchajijieguoVO selectVO(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
   	
   	List<JianchajijieguoView> selectListView(Wrapper<JianchajijieguoEntity> wrapper);
   	
   	JianchajijieguoView selectView(@Param("ew") Wrapper<JianchajijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianchajijieguoEntity> wrapper);
   	
}

