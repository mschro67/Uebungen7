//by mschro67

package p2;

import java.util.Arrays;

public class p2_main{
    public static void main(String[] args) {
        letterGame game=new letterGame("ABC ");

        int[] a={0,1,2,3,0,1,2};
        game.setword(a);

        System.out.println("keyString: \""+game.keyString+"\"\na: "+Arrays.toString(game.findCode(game.word))+"\nword: \""+game.word+"\"");
    }
}