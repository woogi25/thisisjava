package ch06.sec13.exam03.package1;

public class A {
	//public ���� ������ ���� �ʵ� ����
	public int field1;
	//default ���� ������ ���� �ʵ� ����
	int field2;
	//private ���� ������ ���� �ʵ� ����
	private int field3;
	
	//������ ����
	public A() {
		field1 = 1;	//o
		field2 = 1;	//o
		field3 = 1;	//o
		
		method1();	//o
		method2();	//o
		method3();	//o
	}	// Ŭ���� ������ ��� ���� �������� ���� X
	
	//public ���� ������ ���� �޼ҵ� ����
	public void method1() {
	}
	
	//default ���� ������ ���� �޼ҵ� ����
	void method2() {
	}
	
	//private ���� ������ ���� �޼ҵ� ����
	private void method3() {
	}
}
