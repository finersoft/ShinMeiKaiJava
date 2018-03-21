
/**
 * 银行账户类【第2版】和对其进行测试的类
 */
package com.finersoft.account2;


/**
 * 名称：银行账户类【第2版】 说明：
 * 
 * @author Finersoft
 * @date 2018年3月21日
 */
class Account {
	/**
	 * 账户名
	 */
	private String name;
	/**
	 * 账号
	 */
	private String no;
	/**
	 * 可用余额
	 */
	private long balance;

	/**
	 * 构造函数
	 * 
	 * @param name
	 *            账户名
	 * @param num
	 *            账号
	 * @param z
	 *            可用余额
	 */
	public Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}


	/**
	 * 确认账户名
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 确认账号
	 * 
	 * @return
	 */
	public String getNo() {
		return no;
	}

	/**
	 * 确认可用余额
	 * 
	 * @return
	 */
	public long getBalance() {
		return balance;
	}

	/**
	 * 存入k日元
	 * 
	 * @param k
	 */
	public void deposit(long k) {
		balance += k;
	}

	/**
	 * 取出k日元
	 * 
	 * @param k
	 */
	public void withdraw(long k) {
		balance -= k;
	}
}


/**
 * 名称：用于测试银行账户类【第2版】的类 
 * 说明：
 * 
 * @author Finersoft
 * @date 2018年3月21日
 */
public class AccountTester {

	public static void main(String[] args) {
		// 足立的账户
		Account adachi = new Account("足立幸一", "123456", 1000);
		// 仲田的账户
		Account nakata = new Account("仲田真二", "654321", 200);
		 // 足立取了200日元
		adachi.withdraw(200);
		 // 仲田存了100日元
		nakata.deposit(100);

		System.out.println("■足立的账户");
		System.out.println(" 账户名：" + adachi.getName());
		System.out.println(" 账号：" + adachi.getNo());
		System.out.println(" 可用余额：" + adachi.getBalance());

		System.out.println("■仲田的账户");
		System.out.println(" 账户名：" + nakata.getName());
		System.out.println(" 账号：" + nakata.getNo());
		System.out.println(" 可用余额：" + nakata.getBalance());
	}
}
