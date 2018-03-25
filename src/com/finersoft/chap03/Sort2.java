package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明： 将两个变量按升序（从小到大的顺序）进行排序<br/>
 * @author Finersoft
 * @date 2018年3月25日
 */
class Sort2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("变量a：");
			int a = stdIn.nextInt();
			System.out.print("变量b：");
			int b = stdIn.nextInt();
			if (a > b) { 
				// 如果a大于b,交换它们的值
				int t = a; 
				a = b;
				b = t;
			}
			System.out.println("排序成a≦b。");
			System.out.println("变量a是" + a + "。");
			System.out.println("变量b是" + b + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
