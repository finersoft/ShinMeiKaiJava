package com.finersoft.chap04;
// 对读入的整数进行加法运算（不对负值进行加法运算）

import java.util.Scanner;

class SumContinue {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("对整数进行加法运算。");
			System.out.print("要相加多少个整数：");
			// 要相加的个数
			int n = stdIn.nextInt(); 
			// 合计值
			int sum = 0; 
			for (int i = 0; i < n; i++) {
				System.out.print("整数：");
				int t = stdIn.nextInt();
				if (t < 0) {
					System.out.println("不对负值进行加法运算。");
					continue;
				}
				sum += t;
			}
			System.out.println("合计值为" + sum + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
