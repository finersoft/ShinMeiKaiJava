package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：升值排列三个数<br/>
 * 
 * @author Finersoft
 * @date 2018年3月26日
 */
public class Ex0316 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数l：");
			int l = stdIn.nextInt();
			System.out.print("整数m：");
			int m = stdIn.nextInt();
			System.out.print("整数n：");
			int n = stdIn.nextInt();

			int max = Math.max(l, m);
			max = Math.max(max, n);
			int min = Math.min(l, m);
			min = Math.min(min, n);
			int mid = (l + m + n) - (max + min);

			System.out.println("从小到大:" + min + "," + mid + "," + max);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
