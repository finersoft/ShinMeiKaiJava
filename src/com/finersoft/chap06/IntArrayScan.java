package com.finersoft.chap06;
// 读入数组中全部元素的值并显示

import java.util.Scanner;

class IntArrayScan {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("元素个数：");
			int n = stdIn.nextInt(); // 读入元素个数
			int[] a = new int[n]; // 创建数组
			for (int i = 0; i < n; i++) {
				System.out.print("a[" + i + "] = ");
				a[i] = stdIn.nextInt();
			}
			for (int i = 0; i < n; i++)
				{System.out.println("a[" + i + "] = " + a[i]);}
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
