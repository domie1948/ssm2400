package com.entity.view;

import com.entity.JianchajijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检查及结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("jianchajijieguo")
public class JianchajijieguoView  extends JianchajijieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianchajijieguoView(){
	}
 
 	public JianchajijieguoView(JianchajijieguoEntity jianchajijieguoEntity){
 	try {
			BeanUtils.copyProperties(this, jianchajijieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
