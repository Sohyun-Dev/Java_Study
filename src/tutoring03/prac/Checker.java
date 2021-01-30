package tutoring03.prac;

public class Checker {
    // TODO : 숫자로만 구성
    // TODO : 문자열의 길이가 4 이상 6

    public boolean check(String input) {
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                continue;
            }
            result = false;
        }

        if(input.length() < 4 && input.length() > 6){
            result = false;
        }
        return result;
    }
}
