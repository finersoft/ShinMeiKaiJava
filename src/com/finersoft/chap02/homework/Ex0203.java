package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-3<br />
 * 说明：显示键盘输入的数字。
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0203 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入整数值：");
			int a = stdIn.nextInt();
			System.out.println("你输入的是：" + a+"。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
