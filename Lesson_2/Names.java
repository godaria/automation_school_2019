import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Names {
    
    public static void main(String[] args) {
		Scanner names = new Scanner(System.in);
        System.out.println("Enter your name: ");
		String name = names.nextLine();
		System.out.println("Enter your surname: ");
        String surname = names.nextLine();
        System.out.println(name + " " + surname + ", lesson 2 is finished");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}


