package com.finersoft.api.math2;

// java.lang.Math类的摘录

public final class Math {
	//--- 计算绝对值 ---//
	public static double abs(double a) {
		return (a <= 0.0D) ? 0.0D - a : a;
	}

	
	/**
	 * 计算平方根
	 * @param a 待求平方数
	 * @return
	 */
	public static double sqrt(double a) {
		return java.lang.Math.sqrt(a);

	}

	//...
}
