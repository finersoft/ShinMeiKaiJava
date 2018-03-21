package com.finersoft.day5;



/**
 * 名称：日期类Day【第5版】
 * 说明：
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Day {
	/**
	 * 公历年份
	 */
	private int year  = 1;		
	/**
	 * 月
	 */
	private int month = 1;		
	/**
	 * 日
	 */
	private int date  = 1;		


	/**
	 * y年是闰年吗？
	 * @param y 待测试年份
	 * @return true,闰年;false,平年
	 */
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	
	/**
	 * 构造函数
	 */
	public Day()                              { }
	/**
	 * 构造函数
	 * @param year 年
	 */
	public Day(int year)                      { this.year = year; }
	/**
	 * 构造函数
	 * @param year 年
	 * @param month 月
	 */
	public Day(int year, int month)           { this(year); this.month = month; }
	/**
	 * 构造函数
	 * @param year 年
	 * @param month 月
	 * @param date 日 
	 */
	public Day(int year, int month, int date) { this(year, month); this.date = date; }
	/**
	 * 构造函数
	 * @param d 初始日期
	 */
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	//--- 获取年、月、日 ---//
	/**
	 * 获取年
	 * @return 
	 */
	public int getYear()  { return year; }	 
	/**
	 *   获取月
	 * @return
	 */
	public int getMonth() { return month; }	
	/**
	 *   获取日
	 * @return
	 */
	public int getDay()   { return date; }	

	//--- 设置年、月、日 ---//
	/**
	 *  设置年
	 * @param year 年
	 */
	public void setYear(int year)   { this.year  = year; }	
	/**
	 *  设置月
	 * @param month 月
	 */
	public void setMonth(int month) { this.month = month; }	
	/**
	 *  设置日
	 * @param date 日
	 */
	public void setDate(int date)   { this.date  = date; }	

	/**
	 * 设置年、月、日
	 * @param year 年
	 * @param month 月
	 * @param date 日
	 */
	public void set(int year, int month, int date) {	
		this.year  = year;			
		this.month = month;			
		this.date  = date;			
	}

	
	/**
	 * 是闰年吗？
	 * @return
	 */
	public boolean isLeap() { return isLeap(year); }


	/**
	 *  计算星期
	 * @return
	 */
	public int dayOfWeek() {
		// 0 … 星期日
		int y = year;			
		// 1 … 星期一
		int m = month;			
		//　 ：
		if (m == 1 || m == 2) {	
			// 5 … 星期五
			y--;				
			// 6 … 星期六
			m += 12;			
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	
	/** (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (year * 372) + (month * 31) + date;
	}
	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			{return true;}
		if (obj instanceof Day) {
			Day d = (Day)obj;
			return (year == d.year && month == d.month && date == d.date) ? true
																		  : false;
		}
		return false;
	}


	/**
	 * 返回字符串表示 
	 *  (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String[] wd = {"日", "一", "二", "三", "四", "五", "六"};
		return String.format("%04d年%02d月%02d日(%s)", 
								year, month, date, wd[dayOfWeek()]);
	}
}
