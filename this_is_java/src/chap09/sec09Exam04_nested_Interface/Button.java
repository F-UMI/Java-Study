package chap09.sec09Exam04_nested_Interface;

public class Button {
    OnClickListener onClickListener;

    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    void touch() {
        onClickListener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }

}
