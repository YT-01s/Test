package week09;

public class week09_01 {
	public static void print() { // �޼ҵ� ����
		System.out.println("\n----------");
	}
	public static void main(String []args) {
		int [][] array = {{2,3,4}, {8,5,6}};
		print(); // �޼ҵ� ȣ��
		for(int[] row : array) {
			for(int data : row)
				System.out.printf("%5d", data);
			print(); // �޼ҵ� ȣ��
		}
	}

}
// �޼ҵ� - ��ȯ���� ���ٸ� void �� �� �������
// �Ű����� - ������ ����, Ÿ��