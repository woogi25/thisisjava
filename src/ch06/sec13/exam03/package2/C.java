package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		//��ü ����
		A a = new A();
		
		//�ʵ尪 ����
		a.field1 = 1;	//o
//		a.field2 = 1;	//x	default �ʵ� ���� �Ұ�
//		a.field3 = 1;	//x	private �ʵ� ���� �Ұ�
	
		//�޼ҵ� ȣ��
		a.method1();	//o
//		a.method2();	//x default �޼ҵ� ���� �Ұ�
//		a.method3();	//x private �޼ҵ� ���� �Ұ�
	}
}
