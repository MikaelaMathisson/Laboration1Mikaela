import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int[] elPriser = new int[24];

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
                //Input av elpriser för varje timme
                System.out.println("Ange elpriser i öre per kwh för varje timme under dygnet");
                for (int i = 0; i < 24; i++) {
                    while (true) {
                        System.out.print(String.format("Ange pris för timme %02d-%02d: ", i, (i + 1) % 24));
                        String prisInput = scanner.nextLine();
                        try {
                            elPriser[i] = Integer.parseInt(prisInput);  // Försök att konvertera input till ett heltal
                            break;  // Om inmatningen lyckas, bryt loopen och gå till nästa timme
                        } catch (NumberFormatException e) {
                            System.out.println("Felaktig inmatning! Ange ett giltigt heltal för priset i öre.");
                        }
                    }
                }
                System.out.println("Priserna har registrerats.");
            } else if ("2".equals(input)) {
                //Do option 2 - Min, Max och Medel
                System.out.println("Du har valt: "+ input);
                if (elPriser[0] == 0) {
                    System.out.println("Inga elpriser är registrerade");
                }
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
