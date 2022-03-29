// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

class P344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;i<n/2;i++){
            s[i] = (char)(s[i]+s[n-i-1]);
            s[n-i-1] = (char)(s[i]-s[n-i-1]);
            s[i] = (char)(s[i]-s[n-i-1]);
        }
    }
}