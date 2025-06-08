package com.entity.vo;

import com.entity.PingguzhenduanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 评估诊断
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class PingguzhenduanVO  implements Serializable {
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
