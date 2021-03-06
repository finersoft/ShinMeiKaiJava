package com.finersoft.chap11;
// 计算圆的面积（静态导入圆周率Math.PI）

import java.util.Scanner;
import static java.lang.Math.PI;

class Circle2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("计算圆的面积。");
			System.out.print("半径：");
			double r = stdIn.nextDouble();
			System.out.println("面积为" + (PI * r * r) + "。");
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
