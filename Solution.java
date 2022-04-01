import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> mymap = new HashMap<>();
        mymap.put('I', 1);
        mymap.put('V', 5);
        mymap.put('X', 10);
        mymap.put('L', 50);
        mymap.put('C', 100);
        mymap.put('D', 500);
        mymap.put('M', 1000);
        int num = mymap.get(s.charAt((s.length()) - 1));;
        for (int i = s.length() - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (mymap.get(s.charAt(i)) >= mymap.get(s.charAt(i + 1))) {
                num += mymap.get(s.charAt(i));
            } else {
                num -= mymap.get(s.charAt(i));
            }
        }
        return num;
    }


    public static void main(String[] args) {
        String input = "IV";
        int x = 101;
        Solution sol = new Solution();
        int output = sol.romanToInt(input);
        System.out.println(output);
    }
}