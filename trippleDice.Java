import java.util.Random;
public class trippleDice extends dice {
	public trippleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public void Throw()
	{
		Random random = new Random();
		value =random.nextInt(6)+1;
		System.out.print("You Rolled :"+value);
		value =random.nextInt(6)+1;
		System.out.print(", "+value);
		value =random.nextInt(6)+1;
		System.out.print(", and "+value);
	}
}
