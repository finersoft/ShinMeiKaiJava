package com.finersoft.chap02.homework;

import java.util.Random;

/**
 * 名称：作业2-7<br />
 * 说明：随机数：生成1到9中一个值，生成-9到-1中的一个值，显示10到99中的一个值。
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0207 {
	public static void main(String[] args) {
		Random rand = new Random();
		//rand.nextInt的值域[0,n)，所以左右取极限
		// [1,9]=[1,10) = [0+1,9+1)
		System.out.println("随机一位正整数：" + (rand.nextInt(9) + 1) + "。");
		// 上面乘以-1
		System.out.println("随机一位负整数：" + ((rand.nextInt(9) + 1) * -1) + "。");
		// [10,99]=[10,100) = [0+10,90+10)
		System.out.println("随机两位正整数：" + (rand.nextInt(90) + 10) + "。");
	}
}
