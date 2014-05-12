import java.util.Random;
public class dice {

	public int bounces;
	public int value;
	
	public dice(int Bounces, int Value)
	{
		bounces = Bounces;
		value = Value;
	}
	public int Throw() {		
		Random random = new Random();		
			value = random.nextInt(6)+1;  		
	return value;
	}
}
