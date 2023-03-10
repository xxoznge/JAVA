
class InstancePrint{
	public String delimiter ="";
	public void A() { // 인스턴스 소속이므로 static이 없어짐 (class 소속일 때 있는 것)
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}