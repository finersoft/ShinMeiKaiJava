package com.finersoft.chap02;

import java.util.Scanner;

/**
 * 名称：  <br />
 * 说明：计算圆的周长和面积（其２：使用final变量表示圆周率）
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class Circle2 {
	/**
	 * 常量 PI 圆周率
	 */
	static final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("半径：");
			// 半径
			double r = stdIn.nextDouble();

			System.out.println("周长是" + 2 * PI * r + "。");
			System.out.println("面积是" + PI * r * r + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
