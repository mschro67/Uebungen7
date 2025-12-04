//by mschro67

package p2;

public class letterGame{
    public String keyString="",word="";

    public letterGame(String keyString) {
        this.keyString=keyString;
    }

    public void setword(int[] a){
        String placeholder="";
        for (int x=0;x<a.length;x++){
            placeholder+=String.valueOf(keyString.charAt(a[x]));
        }
        this.word=placeholder;
    }

    public int[] findCode(String word) {
        int[] a = new int[word.length()];
        for (int x=0;x<a.length;x++){
            a[x]=Integer.valueOf(this.keyString.indexOf(word.charAt(x)));
        }
        return a;
    }
}