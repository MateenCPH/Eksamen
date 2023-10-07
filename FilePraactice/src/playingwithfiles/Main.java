package playingwithfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
    {
        public static void main(String[] args)
            {
                File file = new File("players.txt");
                try
                    {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine())
                            {
                                String input = scanner.nextLine();
                                String[] info = input.split(",");
                                String playername = info[0];
                                int playerbalance = Integer.parseInt(info[1]);
                                Player p = new Player(playername, playerbalance);
                                System.out.println(p);
                                //  System.out.println(s);
                            }
                    } catch (FileNotFoundException e)
                    {
                        System.out.println("Filen findes ikke");
                    }
            }
    }
