import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        while (true) {

            System.out.println("\n=== ШИФР ЦЕЗАРЯ ===");
            System.out.println("1. Шифрование");
            System.out.println("2. Расшифровка");
            System.out.println("3. Brute Force");
            System.out.println("0. Выход");

            int choice =
                    Integer.parseInt(
                            scanner.nextLine());

            switch (choice) {

                case 1 -> {

                    System.out.print("Входной файл: ");
                    String input =
                            scanner.nextLine();

                    System.out.print("Выходной файл: ");
                    String output =
                            scanner.nextLine();

                    System.out.print("Ключ: ");
                    int key =
                            Integer.parseInt(
                                    scanner.nextLine());

                    String text =
                            FileManager.readFile(input);

                    String result =
                            CaesarCipher.encrypt(
                                    text,
                                    key);

                    FileManager.writeFile(
                            output,
                            result);

                    System.out.println(
                            "Файл зашифрован.");
                }

                case 2 -> {

                    System.out.print("Входной файл: ");
                    String input =
                            scanner.nextLine();

                    System.out.print("Выходной файл: ");
                    String output =
                            scanner.nextLine();

                    System.out.print("Ключ: ");
                    int key =
                            Integer.parseInt(
                                    scanner.nextLine());

                    String text =
                            FileManager.readFile(input);

                    String result =
                            CaesarCipher.decrypt(
                                    text,
                                    key);

                    FileManager.writeFile(
                            output,
                            result);

                    System.out.println(
                            "Файл расшифрован.");
                }

                case 3 -> {

                    System.out.print("Входной файл: ");
                    String input =
                            scanner.nextLine();

                    System.out.print("Выходной файл: ");
                    String output =
                            scanner.nextLine();

                    String text =
                            FileManager.readFile(input);

                    String result =
                            BruteForce.decrypt(text);

                    FileManager.writeFile(
                            output,
                            result);

                    System.out.println(
                            "Brute Force завершен.");
                }

                case 0 -> {
                    return;
                }

                default ->
                        System.out.println(
                                "Неверный пункт.");
            }
        }
    }
}