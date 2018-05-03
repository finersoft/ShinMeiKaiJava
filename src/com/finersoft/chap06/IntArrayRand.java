package com.finersoft.chap06;
// 将随机数赋给数组中的全部元素，并显示为横向柱形图

import java.util.Random;
import java.util.Scanner;

class IntArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		try {

			System.out.print("元素个数：");
			// 读入元素个数
			int n = stdIn.nextInt();
			// 创建数组
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				// 1～10的随机数
				a[i] = 1 + rand.nextInt(10);
			}
			for (int i = 0; i < n; i++) {
				System.out.print("a[" + i + "] : ");
				for (int j = 0; j < a[i]; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
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
