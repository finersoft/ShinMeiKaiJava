package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-4<br />
 * 说明：对键盘输入的数字加10输出，对键盘输入的数字减10再输出 。
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0204 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入整数值：");
			int a = stdIn.nextInt();
			System.out.println("加10之后的值是：" + (a+10)+"。");
			System.out.println("减10之后的值是：" + (a-10)+"。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
