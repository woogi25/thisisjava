package ch06.sec15;

public class Singleton {
	// private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// private ���� ������ ���� ������ ����
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
