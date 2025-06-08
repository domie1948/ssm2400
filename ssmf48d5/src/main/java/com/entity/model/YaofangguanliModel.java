package com.entity.model;

import com.entity.YaofangguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 药房管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class YaofangguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 退药
	 */
	
	private String tuiyao;
				
	
	/**
	 * 设置：退药
	 */
	 
	public void setTuiyao(String tuiyao) {
		this.tuiyao = tuiyao;
	}
	
	/**
	 * 获取：退药
	 */
	public String getTuiyao() {
		return tuiyao;
	}
			
}
