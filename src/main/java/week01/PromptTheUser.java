package week01;

import java.util.Scanner;

public class PromptTheUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el título:");
        String title = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String author = scanner.nextLine();
        System.out.println(title + "fue escrito por " + author);
    }
}
