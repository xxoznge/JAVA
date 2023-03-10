
public class MyOOP {


	public static void main(String[] args) {
		//..
		delimiter ="----";
		printA();
		printA();
		printB();
	}
	public static String delimiter =""; // 클래스 소속 변수
	public static void printA() {
		System.out.println(delimiter); // 클래스 소속 변수 사용
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
