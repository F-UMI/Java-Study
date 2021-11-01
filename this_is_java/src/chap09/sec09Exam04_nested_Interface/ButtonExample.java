package chap09.sec09Exam04_nested_Interface;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        button.setOnClickListener(new CallListiner());
        button.touch();

        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
