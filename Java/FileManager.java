public class FileManager {

    public static String readFile(String fileName) {

        try {

            return java.nio.file.Files.readString(
                    java.nio.file.Path.of(fileName));

        } catch (java.io.IOException e) {

            throw new RuntimeException(
                    "Ошибка чтения файла: "
                            + e.getMessage());
        }
    }

    public static void writeFile(
            String fileName,
            String content) {

        try {

            java.nio.file.Files.writeString(
                    java.nio.file.Path.of(fileName),
                    content);

        } catch (java.io.IOException e) {

            throw new RuntimeException(
                    "Ошибка записи файла: "
                            + e.getMessage());
        }
    }
}
