package ch06_17;
// static 메소드는 객체 생성필요 없이 class.method 로 정의 가능하다.
public class PrinterExample {
	public static void main(String[] args) {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동"); 
	}
}
