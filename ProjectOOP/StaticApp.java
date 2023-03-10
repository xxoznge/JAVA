class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I intance var";
	public static void classMethod() {
		System.out.println(classVar);
		//System.out.println(instanceVar); // Error
	}
	public void instanceMethod(){
		System.out.println(classVar); // ok
		System.out.println(instanceVar); // ok
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // ok
		//System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
		//Foo.instanceMethod(); // Error

		Foo fo1 = new Foo();
		Foo fo2 = new Foo();
		
		System.out.println(fo1.classVar); // I class var
		System.out.println(fo1.instanceVar); // I instance var 
		
		fo1.classVar="changed by f1"; // 클래스를 바꿈
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(fo1.instanceVar); // changed by f1
		
		fo1.instanceVar="changed by f1";  // fo1 인스턴스를 바꿈
		System.out.println(fo1.instanceVar); // changed by f1
		System.out.println(fo2.instanceVar); // I instance var
	}

}
