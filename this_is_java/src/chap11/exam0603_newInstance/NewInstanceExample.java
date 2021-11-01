package chap11.exam0603_newInstance;


public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("chap11.exam0603_newInstance.SendAction");
//            Class clazz = Class.forName("sec11.exam0603_newInstance.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}