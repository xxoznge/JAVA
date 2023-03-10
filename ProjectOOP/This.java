class ThisPrint{
	public String delimiter ="";
	public ThisPrint(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() { 
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
public class This {
	public static void main(String[] args) {
		ThisPrint p1 = new ThisPrint("--------"); 
		p1.A();
		p1.A();
		p1.B();
		p1.B();

	}

}
