package com.finersoft.day2;

import java.util.Scanner;

/**
 * 名称：日期类Day【第2版】的使用示例<br/>
 * 说明：<br/>
 * 
 * @author Finersoft
 * @date 2018年4月11日
 */
class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("请输入day1。");
			System.out.print("年：");
			int y = stdIn.nextInt();
			System.out.print("月：");
			int m = stdIn.nextInt();
			System.out.print("日：");
			int d = stdIn.nextInt();
			// 读入日期
			Day day1 = new Day(y, m, d);
			System.out.println("day1 = " + day1);
			// 与day1相同的日期
			Day day2 = new Day(day1);
			System.out.println("创建了与day1的日期相同的day2。");
			System.out.println("day2 = " + day2);
			if (day1.equalTo(day2)) {
				System.out.println("day1和day2相等。");
			} else {
				System.out.println("day1和day2不相等。");
			}
			// 1年 1月 1日
			Day d1 = new Day();
			// 2010年 1月 1日
			Day d2 = new Day(2010);
			// 2010年10月 1日
			Day d3 = new Day(2010, 10);
			// 2010年10月15日
			Day d4 = new Day(2010, 10, 15);
			System.out.println("d1   = " + d1);
			System.out.println("d2   = " + d2);
			System.out.println("d3   = " + d3);
			System.out.println("d4   = " + d4);
			// 元素个数为3的Day类型数组
			Day[] a = new Day[3];
			for (int i = 0; i < a.length; i++) {
				// 将全部元素都设置为1年1月1日
				a[i] = new Day();
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println("a[" + i + "] = " + a[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
