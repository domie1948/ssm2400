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
 * 药房管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("yaofangguanli")
public class YaofangguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaofangguanliEntity() {
		
	}
	
	public YaofangguanliEntity(T t) {
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
	 * 发药
	 */
					
	private String fayao;
	
	/**
	 * 退药
	 */
					
	private String tuiyao;
	
	
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
	 * 设置：发药
	 */
	public void setFayao(String fayao) {
		this.fayao = fayao;
	}
	/**
	 * 获取：发药
	 */
	public String getFayao() {
		return fayao;
	}
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
