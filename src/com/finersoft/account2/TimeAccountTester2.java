package com.finersoft.account2;

// is-A关系和实例的引用（使用参数的方法进行验证）

class TimeAccountTester2 {

	 
	/**谁的可用余额更多呢		
	 * @param a
	 * @param b
	 * @return
	 */
	static int compBalance(Account a, Account b) {
			// a更多
		if (a.getBalance() > b.getBalance())		
		{		return 1;}
			// b更多
		else if (a.getBalance() < b.getBalance())	
		{	return -1;}
			// a和b相同
		return 0;									
	}

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

		switch (compBalance(adachi, nakata)) {
		 case  0 : System.out.println("足立和仲田的可用余额相同。");  break;
		 case  1 : System.out.println("足立的可用余额更多。");  break;
		 case -1 : System.out.println("仲田的可用余额更多。");  break;
		 default: System.out.println("一脸懵逼，不知道谁的余额更多。");  break;
		}
	}
}
