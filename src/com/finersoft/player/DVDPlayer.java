package com.finersoft.player;

//===== ＤＶＤ播放器 =====//
class DVDPlayer implements ExPlayer {
	/*
	 * (non-Javadoc) ○播放
	 * 
	 * @see com.finersoft.player.Player#play()
	 */
	@Override
	public void play() {
		System.out.println("■ＤＶＤ播放开始！");
	}

	/*
	 * (non-Javadoc) ○停止
	 * 
	 * @see com.finersoft.player.Player#stop()
	 */
	@Override
	public void stop() {
		System.out.println("■ＤＶＤ播放结束！");
	}

	/* (non-Javadoc) ●慢放
	 * @see com.finersoft.player.ExPlayer#slow()
	 */
	@Override
	public void slow() { 
		System.out.println("■ＤＶＤ慢放开始！");
	}
}
