import java.util.Scanner;
import java.lang.Thread;
import java.io.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ChatBot: Hi! How are you?");
        for (int i = 0; i < 2; i++) {
            System.out.print("User: ");
            String input = (scan.nextLine()).toLowerCase();
            if (input.equals("good")) {
                slowString("Great!");
            }
            else if (input.equals("bad")) {
                slowString("Perhaps that's because your talking to a computer and don't have any friends.");
                i = 2;
            }
            else if (input.equals("okay")) {
                slowString("I hope your day becomes even better!");
            }
            else if (input.contains("?") && input.contains("time")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                slowString("The time currently is " + formatter.format(now));
            }
            else if (input.contains("?")) {
                slowString("I'm doing good. Thanks for asking!");
            }
            else {
                slowString("I'm sorry, I didn't understand that.");
            }
        }
        try {
            Thread.sleep(1500);
            System.out.println("ChatBot: Sorry, I've got to go. It was nice to meet you.");
        }
        catch (Exception e) {
            System.out.println("ChatBot: Sorry, I've got to go. It was nice to meet you.");
        }
    }
    static void slowString(String inputString) {
        System.out.print("ChatBot: ");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(inputString.charAt(i));
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println("ChatBot: Sorry, I've got to go. It was nice to meet you.");
            }
        }
        System.out.println();
    }
}