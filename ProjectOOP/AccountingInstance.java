class Accounting2{
	public  double valueOfSupply; // static 없애기
    public static double vatRate = 0.1;  // class 소속으로 남겨둠.
    public Accounting2 (double valueOfSupply) { // 지정자
    	this.valueOfSupply = valueOfSupply;     // this
    }
    public double getVAT() {   // static 없애기
        return valueOfSupply * vatRate;
    }
    public double getTotal() {   // static 없애기
        return valueOfSupply + getVAT();
    }
}
public class AccountingInstance {

	public static void main(String[] args) {
		Accounting2 a1 = new Accounting2(10000.0);
		
		Accounting2 a2 = new Accounting2(10000.0);
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
	}

}
