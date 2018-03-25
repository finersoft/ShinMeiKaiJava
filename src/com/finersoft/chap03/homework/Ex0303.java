/**
 * 
 */
package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：将Sign.java最后一个else 改为 else if (n==0)会怎么样<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0303 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (n > 0) {
				System.out.println("该值为正。");
			} else if (n < 0) {
				System.out.println("该值为负。");
			} else if (n == 0) {
				System.out.println("该值为0。");
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
