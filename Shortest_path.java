import java.util.*;
public class Shortest_path {
    public static float getshortestpath(String path) { // float for non perfect square roots 
        int x = 0;
        int y = 0;
        for(int i = 0; i<path.length() ; i++) { // EK LOOP IMPLIES O(n)
            char dir = path.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            else if(dir == 'S'){
                y--;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;  // to return sqrt[(x2-0)2 + (y2-0)2] i.e. sqrt(x2+y2)

        return (float)Math.sqrt(X2+Y2); // Math.sqrt by default gives a double type value, hence needed to be typecasted in float
    }

    public static void main(String args[]) {
        String path = "WNEENESENNNN";
        System.out.println(getshortestpath(path));
    }
} 
