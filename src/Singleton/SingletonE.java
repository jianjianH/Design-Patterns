package Singleton;

/**
 * 饿汉式单例
 */
public class SingletonE {
	// 1 私有化构造函数
	private SingletonE(){
		
	}
	
	// 3 定义一个静态变量保存类的实例
	private static SingletonE instance = new SingletonE(); 
	
	// 2 定义一个静态类来提供类实例
	public static SingletonE getInstance(){
		// 4 返回创建好的实例
		return instance;
	}
}
