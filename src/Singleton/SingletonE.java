package Singleton;

/**
 * ����ʽ����
 */
public class SingletonE {
	// 1 ˽�л����캯��
	private SingletonE(){
		
	}
	
	// 3 ����һ����̬�����������ʵ��
	private static SingletonE instance = new SingletonE(); 
	
	// 2 ����һ����̬�����ṩ��ʵ��
	public static SingletonE getInstance(){
		// 4 ���ش����õ�ʵ��
		return instance;
	}
}
