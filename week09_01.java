package week09;

public class week09_01 {
	public static void print() { // 메소드 선언
		System.out.println("\n----------");
	}
	public static void main(String []args) {
		int [][] array = {{2,3,4}, {8,5,6}};
		print(); // 메소드 호출
		for(int[] row : array) {
			for(int data : row)
				System.out.printf("%5d", data);
			print(); // 메소드 호출
		}
	}

}
// 메소드 - 반환값이 없다면 void 를 꼭 써줘야함
// 매개변수 - 있으면 개수, 타입