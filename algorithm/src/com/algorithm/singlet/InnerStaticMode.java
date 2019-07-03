package com.algorithm.singlet;
/*使用静态内部类实例单例
  * 这种实现就是利用静态类只会加载一次的机制，使用静态内部类持有单例对象，达到单例的效果*/
public class InnerStaticMode {
	private static class Single{
		private static InnerStaticMode innerStaticMode =new InnerStaticMode();
	}
	
	public InnerStaticMode getInstance(){
		return Single.innerStaticMode;
	}
}
