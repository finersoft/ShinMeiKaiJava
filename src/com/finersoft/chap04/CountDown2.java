package com.finersoft.chap04;


import java.util.Scanner;

/**
 * 名称：从某一正整数值倒数到0（其２）<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年5月4日
 */
class CountDown2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("倒数。");
			int x;
			do {
				System.out.print("正整数值：");
				x = stdIn.nextInt();
			} while (x <= 0);
			while (x >= 0) {
				// 显示x的值并递减
				System.out.println(x--);
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
