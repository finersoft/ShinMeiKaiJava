package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明： 计算两个整数值中较小的值和较大的值<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
class MinMax {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 较小的值／较大的值
		int min, max;

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			if (a < b) {
				// 如果a小于b
				min = a;
				max = b;
			} else {
				// 否则
				min = b;
				max = a;
			}
			System.out.println("较小的值是" + min + "。");
			System.out.println("较大的值是" + max + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}

	}
}
