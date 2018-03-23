package com.finersoft.chap02;

import java.util.Scanner;

/**
 * 名称：  <br />
 * 说明：读入姓名并打招呼（其１：next()版本）
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class HelloNext {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("您的姓名是：");
			// 读入字符串
			String s = stdIn.next();
			// 显示
			System.out.println("你好" + s + "先生。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
