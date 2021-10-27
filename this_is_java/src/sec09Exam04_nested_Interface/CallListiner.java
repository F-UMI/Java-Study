package sec09Exam04_nested_Interface;

public class CallListiner implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
