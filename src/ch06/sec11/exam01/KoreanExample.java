package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// ��ü ���� �� �ֹε�Ϲ�ȣ�� �̸� ����
		Korean k1 = new Korean("123456-1234567", "���ڹ�");
		
		//�ʵ尪 �б�
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//Final �ʵ�� ���� ������ �� ����
		//k1.nation = "USA";
		//K1.ssn = "123-12-1234";
		
		//�� final �ʵ�� �� ���� ����
		k1.name= "���ڹ�";

	}

}
