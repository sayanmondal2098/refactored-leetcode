import java.util.*;

class P13 {
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
            if (mymap.get(s.charAt(i)) >= mymap.get(s.charAt(i + 1))) {
                num += mymap.get(s.charAt(i));
            } else {
                num -= mymap.get(s.charAt(i));
            }
        }
        return num;
    }
}