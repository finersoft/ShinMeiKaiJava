package com.finersoft.chap04;
// 显示九九乘法表（使用System.out.printf）

class MultiTablePrintf {
	public static final int NINE = 9;

	public static void main(String[] args) {
		for (int i = 1; i <= NINE; i++) {
			for (int j = 1; j <= NINE; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
