package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：显示3个数最小值<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0312 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值l：");
			int l = stdIn.nextInt();
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值m：");
			int m = stdIn.nextInt();
			int min = l<n?l:n;
			min= min<m?min:m;
			
			System.out.println("最小值是:"+min);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
