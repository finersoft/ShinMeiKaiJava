package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明： 如果读入的整数值为正值，则判断其为偶数还是奇数，并显示判断结果
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class EvenOdd {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int positive2 = 2;
		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (n > 0) {
				// 以下这儿如果直接写n % 2 == 0
				// 会通不过阿里巴巴代码规范检测器，说不能直接使用魔法数字。
				// 可是我觉得这儿还不如直接写一个2比较容易理解 。
				if (n % positive2 == 0) {
					System.out.println("该值为偶数。");
				} else {
					System.out.println("该值为奇数。");
				}
			} else {
				System.out.println("输入的不是正值。");
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
