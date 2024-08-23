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
                boolean allPricesEntered = true;
                for (int i = 0; i < elPriser.length; i++) {
                    if (elPriser[i] == 0) {
                        allPricesEntered = false;
                        break;
                    }
                }
                if (!allPricesEntered) {
                    System.out.println("Inga eller ofullständiga elpriser är registrerade");
                } else {
                    int minPris = Integer.MAX_VALUE;
                    int maxPris = Integer.MIN_VALUE;
                    int totalPris = 0;
                    int minTimme = 0;
                    int maxTimme = 0;

                    for (int i = 0; i <24; i++){
                        if (elPriser[i] < minPris) {
                            minPris = elPriser[i];
                            minTimme = i;
                        }
                        if (elPriser[i] > maxPris) {
                            maxPris = elPriser[i];
                            maxTimme = i;
                        }
                        totalPris += elPriser[i];
                    }
                    double medelPris = totalPris / 24.0;

                    System.out.println("Lägsta pris: " + minPris + " öre, mellan " + String.format("%02d-%02d", minTimme, (minTimme + 1) % 24));
                    System.out.println("Högsta pris: " + maxPris + " öre, mellan " + String.format("%02d-%02d", maxTimme, (maxTimme + 1) % 24));
                    System.out.println("Medelpris: " + String.format("%.2f", medelPris) + " öre/kWh");
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
