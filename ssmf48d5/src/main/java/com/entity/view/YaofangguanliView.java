package com.entity.view;

import com.entity.YaofangguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药房管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("yaofangguanli")
public class YaofangguanliView  extends YaofangguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaofangguanliView(){
	}
 
 	public YaofangguanliView(YaofangguanliEntity yaofangguanliEntity){
 	try {
			BeanUtils.copyProperties(this, yaofangguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
