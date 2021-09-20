package ch08_5;
//익명객체 호출 개념 습득 다시 필요 .
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
//		anony.method2(
//				Vehicle v = new Vehicle() {
//					
//					@Override
//					public void run() {
//						System.out.println("트럭이 달립니다.");
//						
//					}
//				}
//
//				);
		
	}
	
}
