package com.entity.model;

import com.entity.JianchajijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 检查及结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class JianchajijieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 辅助检查
	 */
	
	private String fuzhujiancha;
				
	
	/**
	 * 设置：辅助检查
	 */
	 
	public void setFuzhujiancha(String fuzhujiancha) {
		this.fuzhujiancha = fuzhujiancha;
	}
	
	/**
	 * 获取：辅助检查
	 */
	public String getFuzhujiancha() {
		return fuzhujiancha;
	}
			
}
