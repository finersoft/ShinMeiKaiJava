/**
 * 
 */
package com.finersoft.chap01.homework;

/**
 * 名称：课后练习1-3
 * 说明：输出姓名，一行一个字符，姓和名中空一行
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Ex0103 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myName = "Finer soft";

		char[] myNameChars = myName.toCharArray();

		for (int i = 0; i < myNameChars.length; i++) {
			System.out.println(myNameChars[i]);
		}
	}

}
