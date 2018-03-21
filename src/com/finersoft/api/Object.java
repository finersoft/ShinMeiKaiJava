

package com.finersoft.api;

/**
 * 名称：Object类
 * 说明：
 * @author Finersoft
 * @date 2018年3月21日
 */
public class Object {

	static {
		registerNatives();
	}
	
	public static void registerNatives() {
		
	}

	public final native Class<?> getClass_1();

	public native int hashCode();

	public boolean equals(Object obj) {
		return (this == obj);
	}

	protected native Object clone() throws CloneNotSupportedException;

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

	public final native void notify_1();

	public final native void notifyAll_1();

	public final native void wait_1(long timeout) throws InterruptedException;

	public final void wait_1(long timeout, int nanos) throws InterruptedException {
		if (timeout < 0) {
			throw new IllegalArgumentException("timeout value is negative");
		}
		if (nanos < 0 || nanos > 999999) {
			throw new IllegalArgumentException(
						"nanosecond timeout value out of range");
		}
		if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
			timeout++;
		}
		wait(timeout);
	}

	public final void wait_1() throws InterruptedException {
		wait(0);
	}

	protected void finalize() throws Throwable { }
}
