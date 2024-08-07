package leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T75Leet1268SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answer = new ArrayList<>();
        boolean[] del = new boolean[products.length];

        Arrays.sort(products);

        for (int i = 0; i < searchWord.length(); i++) {
            for (int j = 0; j < products.length; j++) {
                if (del[j]) {
                    continue;
                }
                if (products[j].length() - 1 < i) {
                    del[j] = true;
                    continue;
                }
                if (products[j].charAt(i) != searchWord.charAt(i)) {
                    del[j] = true;
                }
            }

            List<String> curent = new ArrayList<>();
            int point = 0;
            while (curent.size() < 3 && point < products.length) {
                if (!del[point]) {
                    curent.add(products[point]);
                }
                point++;
            }
            answer.add(curent);
        }

        return answer;
    }
}
