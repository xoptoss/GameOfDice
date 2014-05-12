import java.util.Random;
public class tripleDice extends dice
{
	public tripleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public void Throw() 
// This needs to be an INT, not VOID method
//You will need to retain the value from each of these call and computer the final value.  	{
		super.Throw();
		super.Throw();
		super.Throw();
	}	
}

