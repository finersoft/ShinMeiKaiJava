package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：判断读入的整数值的符号（正／负／0）并显示判断结果<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (n > 0) {
				System.out.println("该值为正。");
			} else if (n < 0) {
				System.out.println("该值为负。");
			} else {
				System.out.println("该值为0。");
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
