class Calcus
{
	int i,j;
	Calcus(int x,int y)
	{
		i=x;
		j=y;
	}
	int reta()
	{
		return i+j;
	}
}
 public class Myclass {
	public static void main(String arg[])
	{
		int sum;
	   Calcus C = new Calcus(2,5);
	   sum = C.reta();
	   System.out.println("Sum is: "+sum);
	}

}
//Alt+shift+x and then press J