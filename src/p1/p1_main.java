//by mschro67

package p1;

public class p1_main{
    public static void main(String[] args){
        Bruch a=new Bruch(1,2),b=new Bruch(1,2);
        multFrac(a,b);
    }
    public static void multFrac(int z1,int n1,int z2,int n2){
        System.out.println(z1*z2+"/"+n1*n2);
    }
    public static void multFrac(Bruch a,Bruch b){
        Bruch result=new Bruch(a.z*b.z,a.n*b.n);
        System.out.println(result.toString());
    }
}