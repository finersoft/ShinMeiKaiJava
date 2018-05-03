package com.finersoft.chap04;
// 显示九九乘法表

class MultiTable {
	public static final int NINE = 9;

	public static void main(String[] args) {
		for (int i = 1; i <= NINE; i++) {
			for (int j = 1; j <= NINE; j++) {
				if (i * j < 10) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}
			System.out.println();
		}
	}
}
