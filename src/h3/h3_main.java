//by mschro67

package h3;

import java.util.Scanner;

public class h3_main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        Mensch a=new Mensch();

        System.out.print("Name: ");
        a.setName(s.nextLine());

        System.out.print("Geburtsjahr: ");
        a.setGebJahr(Integer.parseInt(s.nextLine()));
        a.setAlter();

        s.close();

        System.out.println("");

        System.out.println("Name: "+a.getName()+"\nGeburtsjahr: "+a.getGebJahr()+"\nAlter: "+a.getAlter());
    }
}
