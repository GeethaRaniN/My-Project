public class ConstructorTwo {
	int a,b;
	static double d1;
	
	ConstructorTwo(double d1) {
		this();
		 ConstructorTwo.d1 = d1+2.0;
	}
	
	
	
	ConstructorTwo() {
		this(2,3);
		a =1;
		b =1;
		d1 =2.0;
	}
	
	ConstructorTwo(int a, int b) {
		this.a =a+b;
		this.b =a-b;
		
	}
	public static int methodOne(double d1) {
	ConstructorTwo.d1 = d1+1.0;
	return (int) d1;
	}	
	public int methodTwo(int a ,int b) {
		this.a =a+b;
		this.b =a-b;
		return this.a;
	}
	public static void main(String[] args) {
		ConstructorTwo obj = new ConstructorTwo(2.0);
		int k = ConstructorTwo.methodOne(3.0);
		k = obj.methodTwo(k,k+1);
		System.out.println(k);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
	}
		
		
	
	

}