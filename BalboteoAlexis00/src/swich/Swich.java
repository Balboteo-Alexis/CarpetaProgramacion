package swich;

public class Swich
{

	public static void main(String[] args)
	{
		int numero = 5;
		
		
		switch (numero) {
	    case 0,3,4,5:
	    {
	    	System.out.println ("cero");
	        break;
	    }
	    case 1:
	        System.out.println ("uno");
	        break;
	    case 2:
	        System.out.println ("dos");
	        break;
	    default:
	        System.out.println ("otro");
	}
		
	}

}
