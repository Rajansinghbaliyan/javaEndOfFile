import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s = "";
        int d=1;
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNext()){
            s = s+d+" "+scanner.nextLine()+"\n";
            d++;

        }
        System.out.println(s);
    }
}

