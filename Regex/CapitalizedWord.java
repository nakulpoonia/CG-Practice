package Regex;

import java.util.regex.*;
import java.util.*;

public class CapitalizedWord {
    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;
        while (matcher.find()) {
            if (!first) System.out.print(", ");
            System.out.print(matcher.group());
            first = false;
        }
    }
}

