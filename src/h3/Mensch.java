//by mschro67

package h3;

public class Mensch{
    public String name;
    public int gebJahr,alter;

    public void setName(String value){
        name=value;
    }
    public void setGebJahr(int value){
        gebJahr=value;
    }
    public void setAlter(){
        alter=2025-gebJahr;
    }

    public String getName(){
        return name;
    }
    public int getGebJahr(){
        return gebJahr;
    }
    public int getAlter(){
        return alter;
    }
}
