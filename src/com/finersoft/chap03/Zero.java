package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：读入的整数值是0吗？
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
class Zero {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (!(n != 0)) {
				System.out.println("该值是0。");
			} else {
				System.out.println("该值不是0。");
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
