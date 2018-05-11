package com.finersoft.chap05;

// 计算两个整数值的实数平均值（错误）

import java.util.Scanner;

class Average1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("计算整数值x和y的平均值。");
			System.out.print("x的值：");
			int x = stdIn.nextInt();
			System.out.print("y的值：");
			int y = stdIn.nextInt();
			// 平均值
			double ave = (x + y) / 2; 
			// 显示
			System.out.println("x和y的平均值为" + ave + "。"); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
