/**
 * 
 */
package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：作业3-1<br/>
 * 说明：编写一段程序，读入一个整数值，并显示它的绝对值<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0301 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值：");
			int n = stdIn.nextInt();
			int positiven = n;
			if (n < 0) {
				positiven = n * -1;
			}
			System.out.println("" + n + "的绝对值是：" + positiven);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}

}
