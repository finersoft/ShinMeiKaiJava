package com.finersoft.chap04.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 名称：列举数字<br/>
 * 说明：输入两个数，把这两个数的闭区间里面的数字按从小到大的顺序全部列出来<br/>
 * 
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Ex0403ListNumbers {

	public static int imin = 0;
	public static int imax = 0;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("请输入整数的范围起：");
			int a = stdIn.nextInt();
			System.out.print("\n请输入整数的范围止：");
			int b = stdIn.nextInt();
			imin = Math.min(a, b);
			imax = Math.max(a, b);
			for(int i = imin ;i<=imax ;i++)
			{
				System.out.println(i);
			}
			System.out.println("程序结束 ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}

}
