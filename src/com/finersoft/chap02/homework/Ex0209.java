package com.finersoft.chap02.homework;

import java.util.Random;

/**
 * 名称：作业2-9<br />
 * 说明：随机数：生成0.0到1.0中一个值，生成0.0到10.0中的一个值，显示-1.0到1.0中的一个值。
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0209 {
	public static void main(String[] args) {
		Random rand = new Random();
		//rand.nextDouble的值域[0.0,1.0)，所以左右取极限
		// [0.0,1.0)
		System.out.println("随机大于等于0小于1数：" + (rand.nextDouble())+ "。");
		// 上面乘以10
		System.out.println("随机大于等于0小于10数：" + (rand.nextDouble()*10)+ "。");
		// [0.0,1.0)*2-1.0
		System.out.println("随机大于等于-1小于1数：" + (rand.nextDouble()*2-1)+ "。");
	}
}
