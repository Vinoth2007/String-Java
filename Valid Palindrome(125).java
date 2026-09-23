class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                a = a + c;
            }
        }
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        return a.equals(b);
    }
}
