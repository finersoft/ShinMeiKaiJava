package com.finersoft.chap04;
// 从某一正整数值倒数到0（其１）

import java.util.Scanner;

class CountDown1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("倒数。");
			int x;
			do {
				System.out.print("正整数值：");
				x = stdIn.nextInt();
			} while (x <= 0);
			while (x >= 0) {
				// 显示x的值
				System.out.println(x);
				// x的值递减（值减少1）
				x--;
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
