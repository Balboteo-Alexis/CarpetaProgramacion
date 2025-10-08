package ifElseAnidados;

public class IfElseAnidado
{

	public static void main(String[] args) 
	{
		
		int num1 = 60;
		
		if(num1 > 0)
		{
			System.out.print("\nel numero es positivo");
			if(num1 > 50)
			{
				System.out.print("\nA demás es mayor que 50");
			}
		}
		else {
			if(num1 == 0)
			{
				System.out.print("el numero es 0");
			}
			else 
			{
				System.out.print("el numero es negtivo");
			}
		}
		
		
	}

}
