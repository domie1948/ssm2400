package com.entity.model;

import com.entity.CaiwuguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 财务管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class CaiwuguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室工作量
	 */
	
	private String keshigongzuoliang;
		
	/**
	 * 日结费用
	 */
	
	private String rijiefeiyong;
				
	
	/**
	 * 设置：科室工作量
	 */
	 
	public void setKeshigongzuoliang(String keshigongzuoliang) {
		this.keshigongzuoliang = keshigongzuoliang;
	}
	
	/**
	 * 获取：科室工作量
	 */
	public String getKeshigongzuoliang() {
		return keshigongzuoliang;
	}
				
	
	/**
	 * 设置：日结费用
	 */
	 
	public void setRijiefeiyong(String rijiefeiyong) {
		this.rijiefeiyong = rijiefeiyong;
	}
	
	/**
	 * 获取：日结费用
	 */
	public String getRijiefeiyong() {
		return rijiefeiyong;
	}
			
}
