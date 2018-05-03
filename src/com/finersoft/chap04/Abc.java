package com.finersoft.chap04;

import java.util.Scanner;

/**
 * 名称：Abc<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Abc {
	
	public static final int STAR_LENGTH = 5;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			int x;
			do {
				System.out.print("正整数：");
				x = stdIn.nextInt();
			} while (x <= 0);
			int y = x;
			int z = x;
			while (y >= 0) {
				System.out.printf("%5d%5d\n", y--, ++z);
			}
			System.out.println("长宽为整数、面积为" + x + "的长方形的长和宽为：");
			for (int i = 1; i < x; i++) {
				if (i * i > x) {
					// break语句
					break;
				}
				if (x % i != 0) {
					// continue语句
					continue;
				}
				System.out.printf("%d × %d\n", i, x / i);
			}
			for (int i = 1; i <= STAR_LENGTH; i++) {
				for (int j = 1; j <= STAR_LENGTH; j++) {
					System.out.print('*');
				}
				System.out.println();
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
