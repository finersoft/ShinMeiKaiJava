package com.finersoft.chap02;

import java.util.Scanner;

/**
 * 名称：  <br />
 * 说明：读入整数值并显示对其符号进行取反后的值
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class Minus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			// 读入a的整数值
			int a = stdIn.nextInt();
			// 用对a的符号进行取反后的值来初始化b
			int b = -a;
			System.out.println(a + "的符号取反后的值是" + b + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
