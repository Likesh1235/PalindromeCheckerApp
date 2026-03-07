public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("version:1.0");
        System.out.println("System Initialisation successful");

        String str = "madam";
        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + str);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}