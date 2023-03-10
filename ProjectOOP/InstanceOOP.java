public class InstanceOOP {
	public static void main(String[] args) {
		
		InstancePrint p1 = new InstancePrint(); // 인스턴스 생성
		p1.delimiter="-----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		InstancePrint p2 = new InstancePrint(); // 인스턴스 생성
		p2.delimiter="*****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
	}

}
