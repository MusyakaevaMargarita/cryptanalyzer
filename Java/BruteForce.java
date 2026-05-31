public class BruteForce {

    public static String decrypt(String encryptedText) {

        int bestScore = -1;
        String bestText = "";

        for (int key = 0; key < 43; key++) {

            String candidate =
                    CaesarCipher.decrypt(
                            encryptedText,
                            key);

            int score = evaluate(candidate);

            if (score > bestScore) {

                bestScore = score;
                bestText = candidate;
            }
        }

        return bestText;
    }

    private static int evaluate(String text) {

        int score = 0;

        String[] words = {
                " и ",
                " в ",
                " на ",
                " не ",
                " что ",
                " это "
        };

        for (String word : words) {

            if (text.contains(word)) {
                score++;
            }
        }

        return score;
    }
}
