package sec09.ch09_06;

public class Chatting {
    void startChat(String chatId) {
        final String nickName = chatId;
//        String nickName = null;
//        nickName = chatId;
        Chat chat = new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "안녕하세여";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };

    }

    class Chat {
        void start() {
        }

        void sendMessage(String message) {
        }
    }

}

