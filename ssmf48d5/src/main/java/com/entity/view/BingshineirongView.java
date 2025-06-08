package com.entity.view;

import com.entity.BingshineirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病史内容
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("bingshineirong")
public class BingshineirongView  extends BingshineirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingshineirongView(){
	}
 
 	public BingshineirongView(BingshineirongEntity bingshineirongEntity){
 	try {
			BeanUtils.copyProperties(this, bingshineirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
