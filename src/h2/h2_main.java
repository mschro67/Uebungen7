//by mschro67

package h2;

import java.util.Arrays;

public class h2_main{
    public static void main(String[] args){
        int[] a={1,2,3,4,5},b={1,2,3,4,5};
        System.out.println(Arrays.compare(a,b));
    }
    public static void change(int[] a,int[] b,int start,int end){
        if (end>start&&!(Arrays.compare(a,b)==0)){
            int[] c = Arrays.copyOf(a,a.length);
        }else if (end>start&&a==b){
            Arrays.sort(a);
            int[] c=Arrays.copyOfRange(a,start,end);
        }else if (end<=start){
            int[] c=new int[0];
        }
        //return c;
    }
}
