package com.finersoft.chap13;
//--- 动物类 ---//
public abstract class Animal {
	private String name;			// 名称

	public Animal(String name) { this.name = name; }

	public abstract void bark();		// 叫
	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public abstract String toString();	// 返回字符串表示

	public String getName() { return name; }

	public void introduce() {
		System.out.print(toString());
		bark();
	} 
}
