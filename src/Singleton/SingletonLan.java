package Singleton;

/**
 * 懒汉式单例
 */
public class SingletonLan {
	// 3 定义静态变量来存储创建好的类实例
	private static SingletonLan instance = null;
	
	// 1 私有化构造函数
	private SingletonLan(){
		
	}
	
	// 2 定义静态方法提供类的实例
	public static SingletonLan getInstance(){
		// 4 判断存储类实例的变量是否存在
		if(instance == null){
			// 4.1 不存在就创建
			instance = new SingletonLan();
		}
		
		// 4.2 存在的话就直接返回
		return instance;
	}	
}
