import java.lang.reflect.Array;
import java.util.Scanner;
public class Array_Self {

	public static void main(String[] args)
	{
		System.out.println("Enter elements of array");
		Scanner Keyboard= new Scanner(System.in);
		double[] parneet=new double[4];
		for(int i=0;i<parneet.length;i++)
		{
			parneet[i]=Keyboard.nextDouble();
			
		}
		double total=0;
		for(int j=0;j<parneet.length;j++)
		{
		total=total+ parneet[j];
		
		}
		double average=total/parneet.length;
		System.out.println("average of elements is "+average);

	}

}
