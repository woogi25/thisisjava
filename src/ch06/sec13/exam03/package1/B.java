package ch06.sec13.exam03.package1;	//��Ű���� ����

public class B {
	public void method() {
		//��ü ����
		A a = new A();
		
		//�ʵ尪 ����
		a.field1 = 1;	//o
		a.field2 = 1;	//o
//		a.field3 = 1;	//x	private �ʵ� ���� �Ұ�
		
		//�޼ҵ� ȣ��
		a.method1();	//o
		a.method2();	//o
//		a.method3();	//x	private �޼ҵ� ���� �Ұ�
	}
}
