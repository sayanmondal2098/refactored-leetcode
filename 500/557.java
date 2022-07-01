import java.util.Arrays;
import java.util.stream.Collectors;

//Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

class P557 {
    public String reverseWords(String str) {
                String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        return result;
    }
}