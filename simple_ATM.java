package mini_projects;
import java.util.*;
public class simple_ATM {
	
			public static void main(String[] args)
			{
				int balance=2000,withdraw,deposite,checkbalance,ch=0;
				while(ch<=4)
				{
					System.out.println("Welcome to sbi");
					System.out.println("1.checkbalance");
					System.out.println("2.withdraw");
					System.out.println("3.deposit");
					System.out.println("4.exit");
				
					System.out.println("enter your choice");
					Scanner sc=new Scanner(System.in);
					ch=sc.nextInt();
					
					switch(ch)
					{
						case 1:
						System.out.println("your balance is"+balance);
						break;
						
						case 2:
						System.out.println("enter the value to withdraw");
						Scanner s=new Scanner(System.in);
						withdraw=s.nextInt();
						balance=balance-withdraw;
						System.out.println("balance is"+balance);
						break;
							
						case 3:
						System.out.println("enter the value you want deposite");
						Scanner se=new Scanner(System.in);
						deposite=se.nextInt();
						balance=deposite+balance;
						System.out.println("balance is"+balance);
						break;
						
						case 4:
						System.out.println("Exited");
						break;
					}
				}
			}
	}


