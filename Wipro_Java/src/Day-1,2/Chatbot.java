import java.util.Scanner;

class ChatBotyy {
    void reply(String msg) {
        if (msg.equalsIgnoreCase("hi")) System.out.println("Hello!");
        else if (msg.equalsIgnoreCase("how are you")) System.out.println("I'm a bot, always good!");
        else if (msg.equalsIgnoreCase("bye")) System.out.println("Goodbye!");
        else System.out.println("Sorry, I don't understand.");
    }
}

public class Chatbot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ChatBotyy bot = new ChatBotyy();

        String msg = s.nextLine();
        bot.reply(msg);
        
        s.close();
    }
}
