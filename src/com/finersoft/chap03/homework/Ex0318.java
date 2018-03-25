package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：输入月份，显示输入月份表示的季节<br/>
 * @author Finersoft
 * @date 2018年3月26日
 */
public class Ex0318 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m1 = 1, m2 = 2, m3 = 3, m5 = 5, m6 = 6, m8 = 8, m9 = 9, m11 = 11, m12 = 12;
		try {
			System.out.print("计算季节。\n请输入月份：");
			int month = stdIn.nextInt();
			if (month >= m3 && month <= m5) {
				// 3月·4月·5月
				System.out.println("这是春天。");
			} else if (month >= m6 && month <= m8) {
				// 6月·7月·8月
				System.out.println("这是夏天。");
			} else if (month >= m9 && month <= m11) {
				// 9月·10月·11月
				System.out.println("这是秋天。");
			} else if (month == m12 || month == m1 || month == m2) {
				// 12月·1月·2月
				System.out.println("这是冬天。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}

	}
}
