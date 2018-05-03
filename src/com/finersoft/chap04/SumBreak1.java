package com.finersoft.chap04;
// 对读入的整数进行加法运算（输入0的话就结束）

import java.util.Scanner;

class SumBreak1 {

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
				System.out.print("整数（以0结束）：");
				int t = stdIn.nextInt();
				if (t == 0) {
					// 跳出for语句
					break;
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
