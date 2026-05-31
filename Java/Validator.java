public class Validator {

    public static boolean fileExists(
            String fileName) {

        return java.nio.file.Files.exists(
                java.nio.file.Path.of(fileName));
    }

    public static boolean isValidKey(
            int key) {

        return key >= 0;
    }
}
