package com.finersoft.account2;



/**
 * 名称：带定期存款的银行账户类【第1版】<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月11日
 */
class TimeAccount extends Account {
		// 可用余额（定期存款）
	private long timeBalance;		


	/**
	 * 构造函数
	 * @param name
	 * @param no
	 * @param balance
	 * @param timeBalance
	 */
	TimeAccount(String name, String no, long balance, long timeBalance) {
		// 调用类Account的构造函数
		super(name, no, balance);		
		// 可用余额（定期存款）
		this.timeBalance = timeBalance;	
	}

	 
	/**
	 * 确认定期存款
	 * @return
	 */
	long getTimeBalance() {
		return timeBalance;
	}

	 
	/**解除定期存款，全部转为普通存款
	 * @param k
	 */
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
