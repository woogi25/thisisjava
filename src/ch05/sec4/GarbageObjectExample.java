package ch05.sec4;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "����";
		hobby = null; //"����"�� �ش��ϴ� String ��ü�� ������� ����

		String kind1 = "�ڵ���";
		String kind2 = kind1; // kind1 ������ ����Ǿ� �ִ� ������ kind2 ������ ����
		kind1 = null;	//"�ڵ���"�� �ش��ϴ� String ��ü�� �����Ⱑ �ƴ�
		System.out.println("kind2: " + kind2);
	}

}
