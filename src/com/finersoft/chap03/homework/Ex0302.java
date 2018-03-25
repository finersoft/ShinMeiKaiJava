/**
 * 
 */
package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：输入两个整数<br/>
 * 如果后一个是前一个的约数，则输出后一个是前一个的约数<br/>
 * 否则输出后一个不是前一个的约数<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0302 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值：");
			int m = stdIn.nextInt();
			int nmodem = -1;
			String isornot = "不是";
			if (m != 0) {
				nmodem = n % m;
			}
			if (nmodem == 0) {
				isornot = "是";
			}
			System.out.println("" + m + isornot + n + "的约数");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}

}
