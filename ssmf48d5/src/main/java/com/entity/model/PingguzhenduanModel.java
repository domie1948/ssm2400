package com.entity.model;

import com.entity.PingguzhenduanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 评估诊断
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class PingguzhenduanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 中医诊断
	 */
	
	private String zhongyizhenduan;
				
	
	/**
	 * 设置：中医诊断
	 */
	 
	public void setZhongyizhenduan(String zhongyizhenduan) {
		this.zhongyizhenduan = zhongyizhenduan;
	}
	
	/**
	 * 获取：中医诊断
	 */
	public String getZhongyizhenduan() {
		return zhongyizhenduan;
	}
			
}
