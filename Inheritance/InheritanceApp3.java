class Cal6{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;
	}	
}
class Cal7 extends Cal6{ 
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	
	// Overriding
	public int sum(int v1, int v2) { // 부모가 가지고 있는 메소드 재정의
		System.out.println("Cal3!!");
		return super.sum(v1, v2);
	}
}
public class InheritanceApp3 {

	public static void main(String[] args) {
		Cal6 c = new Cal6();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2,1,1));
		
		Cal7 c3 = new Cal7();
		System.out.println(c3.sum(2,1)); 
		System.out.println(c3.minus(2,1));
		System.out.println(c3.sum(2,1)); 
	}
}
