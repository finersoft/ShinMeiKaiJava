package com.finersoft.chap04;


import java.util.Scanner;

/**
 * 名称：显示读入的整数值的所有约数<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年5月4日
 */
class Measure {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			for (int i = 1; i < n; i++) {
				// 如果能整除
				if (n % i == 0) {
					// 显示
					System.out.println(i);
				}
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
