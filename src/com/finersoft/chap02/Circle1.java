package com.finersoft.chap02;


import java.util.Scanner;

/**
 * 名称： <br />
 * 说明：计算圆的周长和面积（其１：使用浮点型常量来表示圆周率）
 * @author Finersoft
 * @date 2018年3月23日
 */
class Circle1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("半径：");
			// 半径
			double r = stdIn.nextDouble();	

			System.out.println("周长是" + 2 * 3.14 * r + "。");
			System.out.println("面积是" + 3.14 * r * r + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
