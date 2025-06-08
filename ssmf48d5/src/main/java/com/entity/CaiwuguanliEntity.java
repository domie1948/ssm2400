package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 财务管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("caiwuguanli")
public class CaiwuguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaiwuguanliEntity() {
		
	}
	
	public CaiwuguanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医生工作量
	 */
					
	private String yishenggongzuoliang;
	
	/**
	 * 科室工作量
	 */
					
	private String keshigongzuoliang;
	
	/**
	 * 日结费用
	 */
					
	private String rijiefeiyong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医生工作量
	 */
	public void setYishenggongzuoliang(String yishenggongzuoliang) {
		this.yishenggongzuoliang = yishenggongzuoliang;
	}
	/**
	 * 获取：医生工作量
	 */
	public String getYishenggongzuoliang() {
		return yishenggongzuoliang;
	}
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
