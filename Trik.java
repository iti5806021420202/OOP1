import java.util.Scanner;
public class Trik {
	public static void main(String[] args) {
		int s=1,b=0,p=0; // ��˹��������������Ƿ�� 3 �
		int tmp=0; //������Ѻ�ѡ��� ���ͷ�����Ѻ���
		String text = null; //����Ѻ��� A B C �ٻẺ�����Ѻ
		char Char;
		Scanner scan =  new Scanner(System.in);
		do{
		System.out.println("Enter Value 50 character (A or B or C) : "); 
		text=scan.next();
		}while(text.length() > 50 || text.length() < 1 || text.length() == 0);
		for(int i=0;i<text.length();i++)
		{
			Char=text.charAt(i);
			if(Char=='A'|| Char=='a')
			{
				tmp=s;
				s=b;
				b=tmp;
			}
			if(Char=='B'|| Char=='b')
			{
				tmp=b;
				b=p;
				p=tmp;
			}
			if(Char=='C'|| Char=='c')
			{
				tmp=s;
				s=p;
				p=tmp;
			}
		}
		if(s==1)System.out.println("glass 1");
		if(b==1)System.out.println("glass 2");
		if(p==1)System.out.println("glass 3");
		}
	}