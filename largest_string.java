import java.util.*;
public class largest_string {
    public static void main(String args[]) {
        String fruits[] = {"apple" , "mango" , "banana"};
        String largest = fruits[0];
        for(int i = 1; i<fruits.length ; i++) {
            if(largest.compareTo(fruits[i])<0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }  // time complexity = O(x*N) where x = largest length of either of the involved strings ; N = no. of strings
} 