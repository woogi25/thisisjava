package ch02.sec6;

public class StringExample {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String job = "���α׷���";
		System.out.println(name);
		System.out.println(job);

		String str = "���� \"�ڹ�\"�� ���ϴ�.";
		System.out.println(str);
		
		str = "��ȣ\t�̸�\t����";
		System.out.println(str);
		
		System.out.print("����\n");
		System.out.print("�ڹٸ�\n");
		System.out.println("���ϴ�.");
		String str2 = """
				���� ���� 
				�Խ��ϴ�.
				""";
		System.out.println(str2);
	}

}
