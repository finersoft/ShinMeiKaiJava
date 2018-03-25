package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：根据读入的值显示对应的猜拳手势（其１：if语句）
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class FingerFlashing1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 石头
		int store = 0;
		// 剪刀
		int shear = 1;
		// 布
		int fabric = 2;
		try {
			System.out.print("请选择手势（0…石头／1…剪刀／2…布）：");
			int hand = stdIn.nextInt();
			if (hand == store) {
				System.out.println("石头");
			} else if (hand == shear) {
				System.out.println("剪刀");
			} else if (hand == fabric) {
				System.out.println("布");
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
