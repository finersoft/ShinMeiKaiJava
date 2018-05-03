package com.finersoft.chap04;
// 显示输入的月份所处的季节

import java.util.Scanner;

class Season {
	/** 一月 1 */
	public static  final int MONTH_JANUARY = 1;
	/** 二月 2 */
	public static  final int MONTH_FEBRUARY = 2;
	/** 三月 */
	public static  final int MONTH_MARCH = 3;
	/** 四月 */
	public static  final int MONTH_APRIL = 4;
	/** 五月 */
	public static  final int MONTH_MAY = 5;
	/** 六月 */
	public  static final int MONTH_JUNE = 6;
	/** 七月 */
	public static  final int MONTH_JULY = 7;
	/** 八月 */
	public  static final int MONTH_AUGUST = 8;
	/** 九月 */
	public static  final int MONTH_SEPTEMBER = 9;
	/** 十月 */
	public  static final int MONTH_OCTOBER = 10;
	/** 十一月 */
	public  static final int MONTH_NOVEMBER = 11;
	/** 十二月 */
	public  static final int MONTH_DECEMBER = 12;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			int retry; // 要重复一次吗？
			do {
				System.out.print("计算季节。\n请输入月份：");
				int month = stdIn.nextInt();
				// 3月·4月·5月
				if (month >=MONTH_MARCH && month <= MONTH_MAY) {
					System.out.println("这是春天。");
				} else if (month >= Season.MONTH_JUNE && month <= Season.MONTH_AUGUST) {
					// 6月·7月·8月
					System.out.println("这是夏天。");
				} else if (month >= Season.MONTH_SEPTEMBER && month <= Season.MONTH_NOVEMBER) {
					// 9月·10月·11月
					System.out.println("这是秋天。");
				} else if (month == Season.MONTH_DECEMBER || month == Season.MONTH_JANUARY || month == Season.MONTH_FEBRUARY) {
					// 12月·1月·2月
					System.out.println("这是冬天。");
				}

				System.out.print("要重复一次吗？ 1…Yes／0…No：");
				retry = stdIn.nextInt();
			} while (retry == 1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
