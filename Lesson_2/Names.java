import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Names {
    public static String name(Scanner name) {
        System.out.println("Enter your name: ");
        String userName = name.nextLine();
        return userName;
    }

    public static String surname(Scanner surname) {
        System.out.println("Enter your surname: ");
        String userSurname = surname.nextLine();
        return userSurname;
    }

    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        String name = name(names);
        String surname = surname(names);
        System.out.println(name + " " + surname);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}