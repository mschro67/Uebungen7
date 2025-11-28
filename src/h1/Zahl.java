//by mschro67

package h1;

public class Zahl{
    public boolean even,small,positive;
    public int num;

    public void setEven(){
        this.even=(num%2==0);
    }
    public void setPositive(){
        this.positive=(num>0);
    }
    public void setSmall(){
        this.small=(num<100);
    }
}
