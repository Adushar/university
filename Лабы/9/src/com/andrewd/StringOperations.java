package com.andrewd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {
    public static String toOctalNumber(int decimal) {
        char octal_numbers_range[]={'0','1','2','3','4','5','6','7'};
        int rem;
        String output="";
        
        while(decimal>0)
        {
            rem=decimal%8;
            output=octal_numbers_range[rem]+output;
            decimal=decimal/8;
        }
        return output;
    }

    public static int countIntWords(String string) {
        return countMatches(string, "\\b[\\d]+\\b");
    }

    // I know that this solution is a piece of shot but didn't found smth better in native java to count matches in string
    // Writing in native Java without modules is like running a sprint in the knightly armor
    public static int countMatches(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
