package com.finersoft.account2;

/**
 * 名称： is-A关系和实例的引用（其１）<br/>
 * 说明：<br/>
 * 
 * @author Finersoft
 * @date 2018年4月11日
 */
class TimeAccountTester1 {

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);
		// 类类型变量 …
		Account x;
		// 可以引用自身类型的实例（这是当然的）
		x = adachi;
		// 也可以引用下位类类型的实例！
		x = nakata;

		System.out.println("x的可用余额：" + x.getBalance());
		// 类类型变量 …
		TimeAccount y;
		// 不可以引用上位类类型的实例！
		// y = adachi;
		// 可以引用自身类型的实例（这是当然的）
		y = nakata;
		System.out.println("y的可用余额：" + y.getBalance());
		System.out.println("y的定期存款：" + y.getTimeBalance());
	}
}
