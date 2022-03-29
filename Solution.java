import java.util.Arrays;
import java.util.List;

class Solution {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        System.out.println(ans[0]);
        ans.reverse();
        return ans.toString();
    }


    public static void main(String[] args) {
        String input = "Geeks For Test";
        Solution sol = new Solution();
        String output = sol.reverseWords(input);
        System.out.println(output);
    }
}