import java.util.*;
public class string_builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(""); // can be left null to but lets initialize it up by an empty string 
        for(char ch = 'a'; ch<='z' ; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }  //time complexity O(26) i.e. O(n)
} 