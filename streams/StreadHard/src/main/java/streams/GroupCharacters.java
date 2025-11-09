package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {
    public static enum CharCategory{
        UPPERCASE_LETTER,
        LOWERCASE_LETTER,
        DECIMAL_DIGIT_NUMBER,
        OTHER_SYMBOL
    }
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('A','a','b','8','#','B','9');
        Map<Object, List<Character>> collect = chars.stream().collect(Collectors.groupingBy(ch -> getCharacterType(ch.charValue())));
System.out.println(collect);
    }

    private static Object getCharacterType(char c) {
        if(Character.isUpperCase(c)) return CharCategory.UPPERCASE_LETTER;
        else if (Character.isLowerCase(c)) return CharCategory.LOWERCASE_LETTER;
        else if(Character.isDigit(c)) return CharCategory.DECIMAL_DIGIT_NUMBER;
        else return CharCategory.OTHER_SYMBOL;

    }
}
