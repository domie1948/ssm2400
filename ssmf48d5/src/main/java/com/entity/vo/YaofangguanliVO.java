package com.entity.vo;

import com.entity.YaofangguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 药房管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class YaofangguanliVO  implements Serializable {
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
