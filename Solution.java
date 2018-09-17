import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int total = x*y;
		
		int discount = 0;
		if(x>=2 && x<= 4)
		{
		    discount = (int)Math.floor((y*0.10));
		}
		else if(x==5)
		{
		    discount = (int) Math.floor((y*0.20));
		   
		}
		else if(x>5)
		{
		    discount = (int) Math.floor((y*0.50));
		}
		else
		{
		   discount = 0;
		}
		
		System.out.println(total - (x*discount));

	}
}
