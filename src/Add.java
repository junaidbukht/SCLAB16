import java.util.*;
public class Add {
	
	int a,b,sum;
	
	public void sum1()
	{
		Scanner ss= new Scanner(System.in);
		System.out.println("Write First Number");
		a=ss.nextInt();
		System.out.println("Write Second Number");
		b=ss.nextInt();
		sum=a+b;
		System.out.println("Sum is" + sum);
		System.out.println("Write Second Number");
	}

}
