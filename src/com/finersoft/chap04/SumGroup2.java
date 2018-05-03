package com.finersoft.chap04;
// 对读入的整数组进行加法运算（5个整数×10组）

import java.util.Scanner;

class SumGroup2 {
	public static final int OUTER_TIMES = 10;
	public static final int INNER_TIMES = 5;
	public static final int OUTER_BREAKER_FLAG = 99999;
	public static final int INNER_BREAKER_FLAG = 88888;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("对整数进行加法运算。");
			// 所有组的合计值
			int total = 0; 
			Outer: for (int i = 1; i <= OUTER_TIMES; i++) {
				System.out.println("■第" + i + "组");

				for (int j = 0; j < INNER_TIMES; j++) {
					System.out.print("整数：");
					int t = stdIn.nextInt();
					if (t == OUTER_BREAKER_FLAG) {
						break Outer;
					} else if (t == INNER_BREAKER_FLAG) {
						continue Outer;
					}
					total += t;
				}
			}
			System.out.println("\n合计值为" + total + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
