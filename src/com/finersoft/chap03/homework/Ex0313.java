package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：求中间值<br/>
 * 说明：求三个数的中间值 <br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0313 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值l：");
			int l = stdIn.nextInt();
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值m：");
			int m = stdIn.nextInt();

			int max = l > m ? l : m;
			int min = l < m ? l : m;
			int mid = max < n ? max : n;
			mid = mid > min ? mid : min;

			System.out.println("中间值是:" + mid);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
