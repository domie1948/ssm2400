package com.entity.view;

import com.entity.GuahaoshoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂号收费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("guahaoshoufei")
public class GuahaoshoufeiView  extends GuahaoshoufeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuahaoshoufeiView(){
	}
 
 	public GuahaoshoufeiView(GuahaoshoufeiEntity guahaoshoufeiEntity){
 	try {
			BeanUtils.copyProperties(this, guahaoshoufeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
