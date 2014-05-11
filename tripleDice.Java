import java.util.Random;
public class tripleDice extends dice {
	public tripleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public void Throw()
	{
		Random random = new Random();		
		for(int i=3;i>0;i--)
		{
			value = value+random.nextInt(6)+1;  		
		}
		value=value/3;
		System.out.println("You Rolled :"+value);
	}	
}
