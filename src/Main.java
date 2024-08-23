import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"e".equalsIgnoreCase(input)) {
            System.out.println("Elpriser");
            System.out.println("========");
            System.out.println("1. Inmatning");
            System.out.println("2. Min, Max och Medel");
            System.out.println("3. Sortera");
            System.out.println("4. Bästa Laddningstid (4h)");
            System.out.println("e. Avsluta");
            input = scanner.nextLine();
            if ("1".equals(input)) {
                //Do option 1 - Inmatning
                System.out.println("Du har valt: " + input);

            } else if ("2".equals(input)) {
                //Do option 2
                System.out.println("Du har valt: "+ input);
            }
            else if ("3".equals(input)) {
                //Do option 3
                System.out.println("Du har valt: "+ input);
            }
            else if ("4".equals(input)) {
                //Do option 4
                System.out.println("Du har valt: "+ input);
            }
            else if ("e".equalsIgnoreCase(input)) {
                //Close menu and end run
                System.out.println("Du har valt att avsluta. " +
                        "Ha en fin dag!");
                scanner.close();
            }
        }



        }

    }
