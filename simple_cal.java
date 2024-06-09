package mini_projects;
import java.util.Scanner;
public class simple_cal {
	
		public static void main(String...args)
		{
			int A,B,c,choise;
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACT");
			System.out.println("3.DIVSION");
			System.out.println("4.MULTI");
			System.out.println("Enter your choise");
			Scanner a=new Scanner(System.in);
			choise=a.nextInt();
			switch(choise)
			{
				case 1:
					System.out.println("Enter two value");
					A=a.nextInt();
					B=a.nextInt();
					
					c=A+B;
					System.out.println("Addition is "+c);
					break;

				case 2:
					System.out.println("Enter two value");
					A=a.nextInt();
					B=a.nextInt();
					c=A-B;
					System.out.println("subtrct is "+c);
					break;
				case 3:
					System.out.println("Enter two value");
					A=a.nextInt();
					B=a.nextInt();
					c=A/B;
					System.out.println("Division is "+c);
					break;
				case 4:
					System.out.println("Enter two value");
					A=a.nextInt();
					B=a.nextInt();
					c=A*B;
					System.out.println("multipliction is "+c);
					break;



			}

		}
	}


