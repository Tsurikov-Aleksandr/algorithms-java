package all.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Easy345ReverseVowelsOfaString {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');//'a', 'e', 'i', 'o', and 'u'
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        List<Character> allVolInString = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                allVolInString.add(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        int end = allVolInString.size() - 1;
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c)) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append(allVolInString.get(end));
                end--;
            }
        }

        return stringBuilder.toString();
    }
}
