package com.finersoft.player;

// 可换肤的随身播放器

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;

	public PortablePlayer() { }							// 构造函数

	@Override
	public void play() {								// ○播放
		System.out.println("◆播放开始！"); 
	}

	@Override
	public void stop() {								// ○停止
		System.out.println("◆播放结束！"); 
	}

	@Override
	public void changeSkin(int skin) {					// ★换肤
		this.skin=skin;
		System.out.print("皮肤换成了");
		switch (this.skin) {
		 case BLACK:   System.out.print("乌黑");	break;
		 case RED:     System.out.print("深红");	break;
		 case GREEN:   System.out.print("柳叶");	break;
		 case BLUE:    System.out.print("露草");	break;
		 case LEOPARD: System.out.print("豹纹");	break;
		 default:	   System.out.print("素色");	break;
		}
		System.out.println("。");
	}	
}