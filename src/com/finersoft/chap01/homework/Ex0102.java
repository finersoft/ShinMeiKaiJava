package com.finersoft.chap01.homework;

/**
 * 名称：课后练习第二题 说明：一行一个字符，输出自己名字
 * 
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Ex0102 {

	public static void main(String[] args) {
		String myName = "Finersoft";

		char[] myNameChars = myName.toCharArray();

		for (int i = 0; i < myNameChars.length; i++) {
			System.out.println(myNameChars[i]);
		}

	}

}
