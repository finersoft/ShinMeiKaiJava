package com.finersoft.chap11;

// 计算圆的面积

import java.util.Scanner;

class Circle1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("计算圆的面积。");
			System.out.print("半径：");
			double r = stdIn.nextDouble();
			System.out.println("面积为" + (Math.PI * r * r) + "。");
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
