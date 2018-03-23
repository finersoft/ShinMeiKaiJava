package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-10<br />
 * 说明：用键盘分两次输入你的姓和名，在程序中输出打招呼
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0210 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("您的姓是：");
			// 读入1行字符串
			String s1 = stdIn.nextLine();
			System.out.print("您的名是：");
			// 读入1行字符串
			String s2 = stdIn.nextLine();
			// 显示
			System.out.println("你好" + s1+s2 + "先生。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
