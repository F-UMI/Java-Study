package sec06.exam01_interface_extends;

public class Example {
    public static void main(String[] args) {
        ImplementationC implementationC = new ImplementationC();


        InterfaceA interfaceA = implementationC;
        interfaceA.methodA();
        System.out.println();

        InterfaceB interfaceB = implementationC;
        interfaceB.methodB();
        System.out.println();

        InterfaceC interfaceC = implementationC;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
        System.out.println();
    }
}
