package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingshineirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingshineirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingshineirongView;


/**
 * 病史内容
 *
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public interface BingshineirongService extends IService<BingshineirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingshineirongVO> selectListVO(Wrapper<BingshineirongEntity> wrapper);
   	
   	BingshineirongVO selectVO(@Param("ew") Wrapper<BingshineirongEntity> wrapper);
   	
   	List<BingshineirongView> selectListView(Wrapper<BingshineirongEntity> wrapper);
   	
   	BingshineirongView selectView(@Param("ew") Wrapper<BingshineirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingshineirongEntity> wrapper);
   	
}

