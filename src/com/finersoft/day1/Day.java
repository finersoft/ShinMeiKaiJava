package com.finersoft.day1;



/**
 * 名称：日期类Day【第1版】
 * 说明：
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Day {
	/**
	 * 年
	 */
	private int year; 
	/**
	 * 月
	 */
	private int month;
	/**
	 * 日
	 */
	private int date;

	/**
	 * 构造函数
	 * 
	 * @param year
	 *            年份
	 * @param month
	 *            月
	 * @param date
	 *            日
	 */
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// 获取年、月、日

	/**
	 * 获取年
	 * 
	 * @return
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 获取月
	 * 
	 * @return
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 获取日
	 * 
	 * @return
	 */
	public int getDate() {
		return date;
	}

	// --- 设置年、月、日 ---//
	/**
	 * 设置年
	 * 
	 * @param year
	 *            年
	 */
	void setYear(int year) {
		this.year = year;
	}

	/**
	 * 设置月
	 * 
	 * @param month 月
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * 设置日
	 * @param date 日
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * 设置年月日
	 * @param year  年
	 * @param month 月
	 * @param date  日
	 */
	public void set(int year, int month, int date) { 
		this.year = year; 
		this.month = month;
		this.date = date;
	}

	/** 计算星期
	 * @return
	 */
	public int dayOfWeek() {
		// 0 … 星期日
		int y = year; 
		 // 1 … 星期一
		int m = month;
		if (m == 1 || m == 2) { 
			// ：
			 // 5 … 星期五
			y--;
			 // 6 … 星期六
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
}
