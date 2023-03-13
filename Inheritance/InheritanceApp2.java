class Cal1{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
}
class Cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}
class Cal4 extends Cal{ // Cal 클래스를 확장해 모든 메소드와 변수를 상속받게 됨.
	
}
public class InheritanceApp2 {

	public static void main(String[] args) {
		Cal1 c = new Cal1();
		System.out.println(c.sum(2,1));
		
		Cal4 c3 = new Cal4();
		System.out.println(c3.sum(2,1));
		
	}
}
