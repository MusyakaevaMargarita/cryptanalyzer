import java.util.HashMap;
import java.util.Map;

public class StatisticalAnalyzer {

    public static int findKey(String text) {

        Map<Character, Integer> frequency =
                new HashMap<>();

        for (char ch : text.toCharArray()) {

            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = ' ';

        int max = 0;

        for (Map.Entry<Character, Integer> entry :
                frequency.entrySet()) {

            if (entry.getValue() > max) {

                max = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        String alphabet =
                "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ .,:!?";

        int encryptedIndex =
                alphabet.indexOf(mostFrequent);

        int spaceIndex =
                alphabet.indexOf(' ');

        return encryptedIndex - spaceIndex;
    }
}
