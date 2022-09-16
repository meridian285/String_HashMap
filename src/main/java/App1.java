public class App1 {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
       // palindrome.
        System.out.println();
    }
    public static class Palindrome {

        public boolean isPalindromeText(String str) {
            StringBuilder polindrom = new StringBuilder(str);
            String text = polindrom.reverse().toString();
            System.out.println(text);
            return true;
        }

    }
}
