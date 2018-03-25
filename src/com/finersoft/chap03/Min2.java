package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：显示读入的两个整数值中较小的值（其１：if语句）
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class Min2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			// 较小的值
			int min;
			if (a < b) {
				min = a;
			} else {
				min = b;
			}
			System.out.println("较小的值是" + min + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
