package p1;

public class Bruch{
    int z,n;

    public Bruch(int z,int n){
        this.z=z;
        this.n=n;
    }

    public String toString(){
        String result=this.z+"/"+this.n;
        return result;
    }
}
