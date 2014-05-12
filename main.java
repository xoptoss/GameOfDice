
public class main {

	public static void main(String[] args) {

		dice Dice = new dice(3,4);
		tripleDice Dice2 = new tripleDice(4,5);
		System.out.println(Dice.Throw());	
		System.out.println(Dice2.Throw());
	}
}
