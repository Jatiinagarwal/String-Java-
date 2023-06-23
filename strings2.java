import java.util.*;
public class strings2 {
    public static void main(String args[]) {

        // concatenation i.e. the process to make a single string out  of multiple strings 
        String firstname = "Jatin";
        String lastname = "Aggarwal";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0)); // printing the character at index 0 
        System.out.println(fullname.charAt(1)); // printing the character at index 1 

        // to print all the letters 
        for(int i = 0 ; i<fullname.length() ; i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();
    } // can also be done by making a seperate function and calling it 
} 