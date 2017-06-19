
import java.util.*;
public class Rain_calc {
	
	public static double rain_calc(double length,double width,double rain_fall)
	{
		double result=0;
		result = (length*12*width*12*rain_fall)/231;
		return result;
	}
	
	public static void main(String[] args) {
		double len, wid;
		double rain;
		System.out.println("What's the length of the roof ?:");
		Scanner scn = new Scanner(System.in);
		len=scn.nextDouble();
		System.out.println("What's the width of the roof ?:");
		wid=scn.nextDouble();
		System.out.println("How much rain fall take place(in inches) ?:");
		rain=scn.nextDouble();
		System.out.println("Total Rainfall is : " +rain_calc(len,wid,rain));
		
	}

}
