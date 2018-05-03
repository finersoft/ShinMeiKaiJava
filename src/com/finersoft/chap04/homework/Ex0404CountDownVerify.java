package com.finersoft.chap04.homework;

import java.util.Scanner;

/**
 * 名称：验证CountDown最后x的值 为-1<br/>
 * 说明：打印出来就好了啊<br/>
 * 
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Ex0404CountDownVerify {
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
			
			System.out.println("最终x的值为："+x);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
