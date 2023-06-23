import java.util.*;
public class strings {
    public static void main(String args[]) {
        char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE-->purani strings me koi change nahi ho skta jo bhi change krna hai vo nayi string banake krna hoga
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name;
        name = sc.nextLine();  // next me sirf ek word aur nextLine me pura sentence
        System.out.println(name);

        System.out.println(name.length()); //to find out the string length
    }
}