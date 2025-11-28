//by mschro67

package h1;

import java.util.Scanner;

public class h1_main{
    public static void main(String[] args){
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        Zahl a = new Zahl(Integer.parseInt(s.nextLine()));
        s.close();
        a.setEven();
        a.setPositive();
        a.setSmall();

        System.out.println("even: "+a.even+"\npositive: "+a.positive+"\nsmall: "+a.small);
    }
}
