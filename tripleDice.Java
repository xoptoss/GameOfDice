import java.util.Random;
public class tripleDice extends dice
{
	public tripleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public int Throw() 
	{
		for(int x = 3; x>0 ;x--)
		{		
			value = value+super.Throw();			
		}
		value = value/3;
		return value;
	}	
}
