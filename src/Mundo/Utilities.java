package Mundo;
import java.util.concurrent.ThreadLocalRandom;

public class Utilities 
{
	public static int randInt( int pMin, int pMax )
	{
		return ThreadLocalRandom.current().nextInt(pMin, pMax + 1);
	}
	
}
