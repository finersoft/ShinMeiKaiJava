package com.finersoft.account3;

// 银行账户类【第3版】

/**
 * 名称：<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月11日
 */
public class Account {
// 赋到了哪一个标识编号
	private static int counter = 0;		
	// 账户名
	private String name;	
	// 账号
	private String no;			
		// 可用余额
	private long balance;	
		// 标识编号
	private int id;			


	/**
	 * 构造函数
	 * @param n
	 * @param num
	 * @param z
	 */
	public Account(String n, String num, long z) {
	// 账户名	
		name = n;				
			// 账号
		no = num;			
		// 可用余额
		balance = z;			
		// 标识编号
		id = ++counter;			
	}


	/**确认账户名
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**确认账号 
	 * @return
	 */
	public String getNo() {
		return no;
	}


	/**确认可用余额 
	 * @return
	 */
	public long getBalance() {
		return balance;
	}


	/**获取标识编号
	 * @return
	 */
	public int getId() {
		return id;
	}


	/**存入k日元
	 * @param k
	 */
	public void deposit(long k) {
		balance += k;
	}

	/**取出k日元
	 * @param k
	 */
	public void withdraw(long k) {
		balance -= k;
	}
}
