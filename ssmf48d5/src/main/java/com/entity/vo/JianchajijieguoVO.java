package com.entity.vo;

import com.entity.JianchajijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 检查及结果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class JianchajijieguoVO  implements Serializable {
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
