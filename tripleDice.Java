import java.util.Random;
public class tripleDice extends dice
{
	public tripleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public void Throw() 
	{
		super.Throw();
		super.Throw();
		super.Throw();
	}	
}
