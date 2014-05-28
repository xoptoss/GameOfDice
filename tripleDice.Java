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


// YOu will need to call
// the Throw method will need to call the base Dice.Throw with proper parameter to represents the 3 dices.
