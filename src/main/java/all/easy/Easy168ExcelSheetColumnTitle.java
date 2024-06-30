package all.easy;

public class Easy168ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder answer = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            answer.insert(0, (char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return answer.toString();
    }
}
