
package com.finersoft.api;

/**
 * 名称：Object类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月21日
 */
public class Object {
	public static final int FIVEHUNDREDSTHOUSANDS = 500000;
	static {
		registerNatives();
	}

	public static void registerNatives() {

	}

	public final native Class<?> getClassPlus();

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public native int hashCode();



	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(java.lang.Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	


	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected native Object clone() throws CloneNotSupportedException;

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

	public final native void notifyPlus();

	public final native void notifyAllPlus();

	public final native void waitPlus(long timeout) throws InterruptedException;

	public final void waitPlus(long timeout, int nanos) throws InterruptedException {
		Boolean nanosIsNotzeroandTimeOutIsZero = (nanos != 0 && timeout == 0);
		if (timeout < 0) {
			throw new IllegalArgumentException("timeout value is negative");
		}
		if (nanos < 0 || nanos > 999999) {
			throw new IllegalArgumentException("nanosecond timeout value out of range");
		}
		if (nanos >= FIVEHUNDREDSTHOUSANDS || nanosIsNotzeroandTimeOutIsZero) {
			timeout++;
		}
		wait(timeout);
	}

	public final void waitPlus() throws InterruptedException {
		wait(0);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
	}
}
