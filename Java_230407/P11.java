package Java_230407;

public class P11 {

	public static void main(String[] args) {
		Calc2 cc2 = new Calc2(); // Calc2 Ŭ������ cc2 ��ü ����
		
		System.out.printf("3�� ����ǥ\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		System.out.printf("�̸�\t����\t����\t����\t����\t���\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		int sum3 = cc2.sum(100, 100, 100); // cc2 �ν��Ͻ��� ���� 3���� �޴� sum�Լ��� sum3�� ����
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.0f\n\n", "������", 100, 100, 100, sum3, cc2.avg(sum3, 3)); // �հ� ��� ���
		
		System.out.printf("4�� ����ǥ\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		System.out.printf("�̸�\t����\t����\t����\t����\t����\t���\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		int sum4 = cc2.sum(100, 100, 100, 100); // cc2 �ν��Ͻ��� ���� 4���� �޴� sum�Լ��� sum4�� ����
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n\n", "������", 100, 100, 100, 100, sum4, cc2.avg(sum4, 4)); // �հ� ��� ���
		
		System.out.printf("5�� ����ǥ\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		System.out.printf("�̸�\t����\t����\t����\t����\t��ȸ\t����\t���\n"); // ���
		System.out.printf("===============================================================\n"); // ���
		int sum5 = cc2.sum(100, 100, 100, 100, 100); // cc2 �ν��Ͻ��� ���� 5���� �޴� sum�Լ��� sum5�� ����
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f\n\n", "������", 100, 100, 100, 100, 100, sum5, cc2.avg(sum5, 5)); // �հ� ��� ���

	}

}