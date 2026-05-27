public class CaesarCipher {
    private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static String encrypt(String text, int key) {

        StringBuilder result = new StringBuilder();
        for (char ch : text.toUpperCase().toCharArray()) {

            int index = ALPHABET.indexOf(ch);

            if (index != -1) {

                int newIndex =
                        (index + key) % ALPHABET.length();

                result.append(ALPHABET.charAt(newIndex));

            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int key) {

        return encrypt(text,
                ALPHABET.length() - (key % ALPHABET.length()));

        }
    }
