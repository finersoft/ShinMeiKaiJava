package com.finersoft.api;

// java.lang.Integer等类的摘录






public final class Integer extends Number implements Comparable<Integer> {
	public static final int MIN_VALUE = 0x80000000;		// int型的最小值
	public static final int MAX_VALUE = 0x7fffffff;		// int型的最大值
	
	/**
	 * 将整型转换成十六进制字符串
	 * @param a 待转换整型数据
	 * @return
	 */
	public static String toHexString (int  a) {
		return java.lang.Integer.toHexString(a);
	}
	//...

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}

