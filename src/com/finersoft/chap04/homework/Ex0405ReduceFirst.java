package com.finersoft.chap04.homework;

import java.util.Scanner;

/**
 * 名称：将CountDown2中的x--变成--x，分析会发生什么<br/>
 * 说明：我赌三毛钱，会倒计时到负数 <br/>
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Ex0405ReduceFirst {

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
				//System.out.println(x--);
				System.out.println(--x);
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
