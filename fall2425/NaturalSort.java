import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("file1.txt");
        strings.add("file10.txt");
        strings.add("file2.txt");
        strings.add("file20.txt");
        strings.add("file3.txt");
        strings.add("a1.txt");
        
        List<String> sortedStrings = naturalSort(strings);
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }
    
    public static List<String> naturalSort(List<String> strings) {
        strings.sort(Comparator.comparing(NaturalSort::generateSortKey));
        return strings;
    }
    
    private static String generateSortKey(String str) {
        Matcher matcher = Pattern.compile("(\\D*)(\\d+)(\\D*)").matcher(str);
        if (matcher.matches()) {
            String prefix = matcher.group(1);
            String number = matcher.group(2);
            String suffix = matcher.group(3);
            
            // Pad the number with leading zeros to a sufficient width
            // Assuming numbers don't exceed 10 digits for simplicity
            String paddedNumber = String.format("%010d", Long.parseLong(number));
            return prefix + paddedNumber + suffix;
        }
        return str;
    }
}