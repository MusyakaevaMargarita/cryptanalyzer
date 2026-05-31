public class CaesarCipher {
    private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ .,«»:!?\"'-";

    public static String encrypt(String text, int key) {

        StringBuilder result = new StringBuilder();
        key = key % ALPHABET.length();
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

    public static String bruteForce(String text) {

        int bestScore = -1;
        String bestText = "";

        for (int key = 0;
             key < ALPHABET.length();
             key++) {
            String candidate =
                    decrypt(text, key);

            int score =
                    evaluate(candidate);

            if (score > bestScore) {

                bestScore = score;
                bestText = candidate;
            }
        }

        return bestText;
    }
    private static int evaluate(String text) {

        int score = 0;

        String[] commonWords = {
                " И ",
                " В ",
                " НА ",
                " НЕ ",
                " ЧТО ",
                " ЭТО ",
                " ПО "
        };
        for (String word : commonWords) {

            if (text.contains(word)) {
                score++;
            }
        }

        return score;
    }

    public static int getAlphabetLength() {

        return ALPHABET.length();
    }
}


