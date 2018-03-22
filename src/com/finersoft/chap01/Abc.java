package com.finersoft.chap01;

/**
 * 名称：在画面上进行输出的程序
 * 说明：
 * @author Finersoft
 * @date 2018年3月21日
 */
public class Abc {

	/**
	 * 主方法
	 * @param args 命令行传入参数
	 */
	public static void main(String[] args) {
		System.out.print("ABC");
		System.out.print("DEF" + "GHI");
		System.out.println("JKL\nXYZ");
		
		//下面是一些思考题 by finersoft 
		String a = "ABC";
		String b = "DEFGHI";
		String c = new String ("JKL\nXYZ");		
		System.out.println(" a == \"ABC\":"+(a=="ABC"));
		System.out.println(" b == \"DEF\"+\\\"GHI\\\":"+(b=="DEF" + "GHI"));
		System.out.println(" c == \"JKL\\nXYZ\":"+(c=="JKL\nXYZ"));
		System.out.println(" \"JKL\\nXYZ\".equals(c):"+("JKL\nXYZ".equals(c)));
	}
}
