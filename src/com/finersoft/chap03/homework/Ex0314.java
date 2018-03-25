package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：显示两数关系<br/>
 * 
 * @author Finersoft
 * @date 2018年3月26日
 */
public class Ex0314 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 较小的值／较大的值
		int min=0, max=0;

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			if (b == a) {
				System.out.println("a==b");
			} else {
				if (a < b) {
					// 如果a小于b
					min = a;
					max = b;
				} else if (b< a) {
					// 否则
					min = b;
					max = a;
				}
				System.out.println("较小的值是" + min + "。");
				System.out.println("较大的值是" + max + "。");
				
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
