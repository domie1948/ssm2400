package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianyihezhuyishixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianyihezhuyishixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianyihezhuyishixiangView;


/**
 * 建议和注意事项
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface JianyihezhuyishixiangService extends IService<JianyihezhuyishixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianyihezhuyishixiangVO> selectListVO(Wrapper<JianyihezhuyishixiangEntity> wrapper);
   	
   	JianyihezhuyishixiangVO selectVO(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
   	
   	List<JianyihezhuyishixiangView> selectListView(Wrapper<JianyihezhuyishixiangEntity> wrapper);
   	
   	JianyihezhuyishixiangView selectView(@Param("ew") Wrapper<JianyihezhuyishixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianyihezhuyishixiangEntity> wrapper);
   	
}

