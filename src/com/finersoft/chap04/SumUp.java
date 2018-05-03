package com.finersoft.chap04;
// 计算1到n的和

import java.util.Scanner;

class SumUp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("计算1到n的和。");
			int n;
			do {
				System.out.print("n的值：");
				n = stdIn.nextInt();
			} while (n <= 0);
			 // 合计
			int sum = 0;
			int i = 1;
			while (i <= n) {
				 // 将sum加上i
				sum += i;
				// 递增i的值
				i++; 
			}
			System.out.println("1到" + n + "的和是" + sum + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
