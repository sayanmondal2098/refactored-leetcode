class P9 {
    public int reverseNumber(int num){
        int reverse = 0;
        while (num !=0) {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        return reverse;
    }

    public boolean isPalindrome(int x) {
        if (x ==  reverseNumber(x) && x >= 0) {
            return true;
        }
          else {
            return false;   
        }
    }
}