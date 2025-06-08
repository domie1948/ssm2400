package com.entity.vo;

import com.entity.JianyihezhuyishixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 建议和注意事项
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
public class JianyihezhuyishixiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 处理意见
	 */
	
	private String chuliyijian;
		
	/**
	 * 诊断结果
	 */
	
	private String zhenduanjieguo;
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：处理意见
	 */
	 
	public void setChuliyijian(String chuliyijian) {
		this.chuliyijian = chuliyijian;
	}
	
	/**
	 * 获取：处理意见
	 */
	public String getChuliyijian() {
		return chuliyijian;
	}
				
	
	/**
	 * 设置：诊断结果
	 */
	 
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
			
}
