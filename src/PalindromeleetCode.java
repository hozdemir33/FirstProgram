public class PalindromeleetCode {

    public static void main(String[] args) {

        int x = 134;
        int rev = 0;

        while (x > 0) {

            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;

        }
        System.out.println(rev);
    }
}

       // System.out.println("This is a Palindrome example"+ ":::" + rev)


