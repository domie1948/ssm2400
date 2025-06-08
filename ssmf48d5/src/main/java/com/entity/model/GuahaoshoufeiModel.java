package com.entity.model;

import com.entity.GuahaoshoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 挂号收费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class GuahaoshoufeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 现场挂号
	 */
	
	private String xianchangguahao;
		
	/**
	 * 日结
	 */
	
	private String rijie;
		
	/**
	 * 退号
	 */
	
	private String tuihao;
		
	/**
	 * 收费
	 */
	
	private String shoufei;
		
	/**
	 * 退费
	 */
	
	private String tuifei;
		
	/**
	 * 患者费用明细
	 */
	
	private String huanzhefeiyongmingxi;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：现场挂号
	 */
	 
	public void setXianchangguahao(String xianchangguahao) {
		this.xianchangguahao = xianchangguahao;
	}
	
	/**
	 * 获取：现场挂号
	 */
	public String getXianchangguahao() {
		return xianchangguahao;
	}
				
	
	/**
	 * 设置：日结
	 */
	 
	public void setRijie(String rijie) {
		this.rijie = rijie;
	}
	
	/**
	 * 获取：日结
	 */
	public String getRijie() {
		return rijie;
	}
				
	
	/**
	 * 设置：退号
	 */
	 
	public void setTuihao(String tuihao) {
		this.tuihao = tuihao;
	}
	
	/**
	 * 获取：退号
	 */
	public String getTuihao() {
		return tuihao;
	}
				
	
	/**
	 * 设置：收费
	 */
	 
	public void setShoufei(String shoufei) {
		this.shoufei = shoufei;
	}
	
	/**
	 * 获取：收费
	 */
	public String getShoufei() {
		return shoufei;
	}
				
	
	/**
	 * 设置：退费
	 */
	 
	public void setTuifei(String tuifei) {
		this.tuifei = tuifei;
	}
	
	/**
	 * 获取：退费
	 */
	public String getTuifei() {
		return tuifei;
	}
				
	
	/**
	 * 设置：患者费用明细
	 */
	 
	public void setHuanzhefeiyongmingxi(String huanzhefeiyongmingxi) {
		this.huanzhefeiyongmingxi = huanzhefeiyongmingxi;
	}
	
	/**
	 * 获取：患者费用明细
	 */
	public String getHuanzhefeiyongmingxi() {
		return huanzhefeiyongmingxi;
	}
			
}
