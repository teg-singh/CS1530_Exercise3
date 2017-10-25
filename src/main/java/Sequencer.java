package exercise_3;

public class Sequencer {
	public static void main (String[] args) {
		if(args.length == 0) {
			System.out.println("Please enter a value");
			System.exit(1);
		}
		else {
			int val = 0;
			try {
				val = Integer.parseInt(args[0]);
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter an INTEGER value");
				System.exit(1);
			}
			System.out.println("Tri(" + val + ") = " + triangle(val));
			System.out.println("Lazy(" + val + ") = " + lazyCaterer(val));
		}
	}

	public static int triangle(int val) {
		return val * (val + 1) / 2;
	}

	public static int lazyCaterer(int val) {
		return ((val*val) + val + 2)/2;
	}
}
