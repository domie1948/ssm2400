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
 * 检查及结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("jianchajijieguo")
public class JianchajijieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianchajijieguoEntity() {
		
	}
	
	public JianchajijieguoEntity(T t) {
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
	 * 体格检查
	 */
					
	private String tigejiancha;
	
	/**
	 * 辅助检查
	 */
					
	private String fuzhujiancha;
	
	
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
	 * 设置：体格检查
	 */
	public void setTigejiancha(String tigejiancha) {
		this.tigejiancha = tigejiancha;
	}
	/**
	 * 获取：体格检查
	 */
	public String getTigejiancha() {
		return tigejiancha;
	}
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
