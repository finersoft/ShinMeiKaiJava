package com.finersoft.chap04;
// 显示读入的整数值以下的奇数

import java.util.Scanner;

class OddNo {
	/**
	 * 偶数间隔数字，2
	 */
	public static final int ODD_INTERVAL = 2;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			for (int i = 1; i <= n; i += ODD_INTERVAL) {
				System.out.println(i);
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
