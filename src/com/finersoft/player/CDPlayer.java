package com.finersoft.player;

//===== ＣＤ播放器 =====//
public class CDPlayer implements Player {
	/** (non-Javadoc)○播放
	 * @see com.finersoft.player.Player#play()
	 */
	@Override
	public void play() {						
		System.out.println("□ＣＤ播放开始！"); 
	}
	/** (non-Javadoc)○停止
	 * @see com.finersoft.player.Player#stop()
	 */
	@Override
	public void stop() {						
		System.out.println("□ＣＤ播放结束！"); 
	}

	public void cleaning() {				   // 清洗
		System.out.println("□已清洗磁头。"); 
	}
}
