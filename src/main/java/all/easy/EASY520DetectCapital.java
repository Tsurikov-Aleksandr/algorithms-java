package all.easy;

public class EASY520DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (!word.equals(word.toLowerCase())) {
            if (!word.equals(word.toUpperCase())) {
                if (!Character.isUpperCase(word.charAt(0))) {
                    return false;
                }
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }

                }
            }
        }

        return true;
    }

}
