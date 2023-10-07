import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("data.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] list = input.split(",");
                String name = list[0];
                int age = Integer.parseInt(list[1]);
                String city = list[2];
                Player p = new Player(name, age, city);
                System.out.println(p);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}