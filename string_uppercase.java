import java.util.*;
public class string_uppercase {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i<str.length() ; i++) {

            if(str.charAt(i) == ' ' && i<str.length()-1) {// last word ke baad lafda na ho isliye dusri condition 
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i)); // baki ko to as such lagana hi tha na to laga diya 
            }
        }
        return sb.toString(); // converting it into string
    }

    public static void main(String args[]) {
        String str = "hi i am jatin aggarwal";
        System.out.println(touppercase(str));
    }
} 