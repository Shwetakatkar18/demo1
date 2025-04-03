import java.util.Scanner
public class numbers{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in)
			System.out.println("Enter two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int mul= num1*num2;
		System.out.println("Multiplication of two numbers are:");
		sc.close();
	}
}
