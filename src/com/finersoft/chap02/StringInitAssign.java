package com.finersoft.chap02;

/**
 * 名称：  <br />
 * 说明： 字符串的初始化和赋值
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class StringInitAssign {

	public static void main(String[] args) {
		// 初始化
		String s1 = "ABC";
		// 初始化
		String s2 = "XYZ";
		// 赋值（重写值）
		s1 = "FBI";
		// 显示
		System.out.println("字符串s1是" + s1 + "。"); 
		// 显示
		System.out.println("字符串s2是" + s2 + "。");
	}
}
