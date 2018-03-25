/**
 * 
 */
package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：输入一个数，如果是负数或0，则输出是负数或0<br/>
 * 如果是正数，且能被5整除，就显示能被5整除<br/>
 * 否则显示不能被5整除。
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0305 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			if(n<=0)
			{
				System.out.println("n不是正整数");
			}else
			{
				if(n%5==0)
				{
					System.out.println("n能被5整除");
				}
				else
				{
					System.out.println("n不能被5整除");
				}
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
