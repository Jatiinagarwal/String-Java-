import java.util.*;
public class Strings_palindrome {
    public static boolean is_palindrome(String str) {
        for(int i = 0; i<str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) { // not equal to simple basic ho gyi yaha isliye pehle false ko return karalo else me true ko 
                return false;
            } // ek loop - implies time complexity O(n)
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // input hamesha main function me jise call krr rhe ho uss function me nahi 
        System.out.println("Enter your String here:");
        String str = sc.nextLine();

        boolean answer = is_palindrome(str);
        System.out.println(answer);
    }
} 
 