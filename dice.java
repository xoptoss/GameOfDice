import java.util.Random;
public class dice {

	public int bounces;
	public int value;

	public dice(int Bounces, int Value)
	{
		bounces = Bounces;
		value = Value;
	}
	public void Throw() {		
		Random random = new Random();
		for(int i=3;i>0;i--)
		{
			value = value+random.nextInt(6)+1;  
		}
		value=value/3;
		System.out.println("You Rolled :"+value);
	}
}
