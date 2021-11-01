package chap06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {

    @Override
    public void methodA() {
        System.out.println("methodA");
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodC() {
        System.out.println("methodC");
    }
}
