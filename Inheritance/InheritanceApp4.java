class Cal8{
	int v1, v2;
	Cal8(int v1, int v2){
		System.out.println("Cal8 init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}
class Cal9 extends Cal8{

	Cal9(int v1, int v2) {
		super(v1, v2); // 부모클래스 생성자 
		System.out.println("Cal9 init!!");
	} 
	public int minus() {return this.v1-v2;}
}
public class InheritanceApp4 {

	public static void main(String[] args) {
		Cal8 c = new Cal8(2,1);
		Cal9 c3 = new Cal9(2,1);
		System.out.println(c3.sum());//3
		System.out.println(c3.minus());//1
	}
}
