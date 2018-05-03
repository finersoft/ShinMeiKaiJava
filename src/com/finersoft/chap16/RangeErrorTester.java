package com.finersoft.chap16;

// 进行1位（0～9）的加法运算

import java.util.Scanner;

//---- 超出范围的异常 ---//
class RangeError extends RuntimeException {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5944641378059182433L;

	RangeError(int n) { super("超出范围的数值：" + n); }
}

//---- 超出范围的异常（形参）---//
class ParameterRangeError extends RangeError {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5393357042401100681L;

	ParameterRangeError(int n) { super(n); }
}

//---- 超出范围的异常（返回值）---//
class ResultRangeError extends RangeError {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6489021845328316219L;

	ResultRangeError(int n) { super(n); }
}

public class RangeErrorTester {

	/*--- n为１位（0～9）吗？ ---*/
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	/*--- 计算1位（0～9）整数a与b的和 ---*/
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ResultRangeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			try {
				System.out.println("它们的和为" + add(a, b) + "。");
			} catch (ParameterRangeError e) {
				System.out.println("加数超出范围。" + e.getMessage());
			} catch (ResultRangeError e) {
				System.out.println("计算结果超出范围。" + e.toString());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
