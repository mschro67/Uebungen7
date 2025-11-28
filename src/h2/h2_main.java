//by mschro67

package h2;

import java.util.Arrays;
import java.util.Scanner;

public class h2_main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int[] a={1,2,3,4,5},b={1,3,3,4,5};

        System.out.print("Start: ");
        int start=Integer.parseInt(s.nextLine());

        System.out.print("End: ");
        int end=Integer.parseInt(s.nextLine());

        s.close();

        System.out.println("\na: "+Arrays.toString(a)+"\nb: "+Arrays.toString(b)+"\nChange: "+Arrays.toString(change(a,b,start,end)));
    }
    public static int[] change(int[] a,int[] b,int start,int end){
        int[] placeholder=new int[0];
        if ((end>start)&&(!(Arrays.compare(a,b)==0))){
            int[] c = Arrays.copyOf(a,a.length);
            return c;
        }else if ((end>start)&&(Arrays.compare(a,b)==0)){
            Arrays.sort(a);
            int[] c=Arrays.copyOfRange(a,start,end);
            return c;
        }
        return placeholder;
    }
}
