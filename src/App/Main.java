package App;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your message: ");
        String text = scanner.nextLine();
        System.out.println("Your name: ");
        String sender = scanner.nextLine();

        MessagePrint.Message message = new MessagePrint.Message(text, sender);
        MessagePrint print = new MessagePrint();
        print.print(message);


    }
}