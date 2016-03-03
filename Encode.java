import java.util.Scanner;
public class Encode {

	public static void main(String[] args) {
		String s1,s2;
		char c;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		s1=scan.nextLine();
		s2=s1.toUpperCase();
		for(i=s2.length()-1;i>=0;i--)
		{
			c=s2.charAt(i);
			if(c=='R'){
				c='E';
			}
			else if(c=='W'){
				c='R';
			}
			else if(c=='E'){
				c='W';
			}
			System.out.print(c);
		}
	}

}