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
 * 挂号收费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("guahaoshoufei")
public class GuahaoshoufeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuahaoshoufeiEntity() {
		
	}
	
	public GuahaoshoufeiEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
