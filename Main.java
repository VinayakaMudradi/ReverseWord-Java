/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class ReverseWord{
    private int index;
    private String sentence;
    private char[] charData;
    private void getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        this.sentence = scan.nextLine();
        
    }
    public String reverse(){
        this.getData();
        charData = new char[this.sentence.length()];
        int i, j;
        for(i=sentence.length()-1,j=0; i>=0; i--,j++){
            charData[j] = this.sentence.charAt(i);
        }
        return new String(charData);
    }
}
public class Main
{
	public static void main(String[] args) {
		ReverseWord re = new ReverseWord();
		System.out.println(re.reverse());
	}
}
