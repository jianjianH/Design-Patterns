package Singleton;

/**
 * ����ʽ����
 */
public class SingletonLan {
	// 3 ���徲̬�������洢�����õ���ʵ��
	private static SingletonLan instance = null;
	
	// 1 ˽�л����캯��
	private SingletonLan(){
		
	}
	
	// 2 ���徲̬�����ṩ���ʵ��
	public static SingletonLan getInstance(){
		// 4 �жϴ洢��ʵ���ı����Ƿ����
		if(instance == null){
			// 4.1 �����ھʹ���
			instance = new SingletonLan();
		}
		
		// 4.2 ���ڵĻ���ֱ�ӷ���
		return instance;
	}	
}
