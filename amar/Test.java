import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

        public static String countCharacters(String s) {

            Map<Character, Integer> charCountMap = new LinkedHashMap<>();

            // Count occurrences of each character

            for (char c : s.toCharArray()) {

                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

            }




            StringBuilder result = new StringBuilder();

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

                result.append(entry.getKey()).append(entry.getValue());

            }

            return result.toString();

        }

        public static void main(String[] args) {

            String s = "aababbccde";

            System.out.println("Output: " + countCharacters(s));

        }

    }
