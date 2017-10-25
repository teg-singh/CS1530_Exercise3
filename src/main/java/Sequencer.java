
public class Sequencer {
	public static void main (String[] args) {
		if(args.length == 0) {
			System.out.println("Please enter a value");
			System.exit(1);
		}
		else {
			try {
				int val = Integer.parseInt(args[0]);
			}
			catch NumberFormatException {
				System.out.println("Please enter an INTEGER value");
				System.exit(1);
			}
			System.out.println("Tri(" + val + ") = " + triangle(val));
			System.out.println("Lazy(" + val + ") = " + lazyCaterer(val));
		}
	}
	
	public static int triangle(int val) {
		if (val = 1) {
			return 1;
		}
		else {
			return val + triangle(val - 1);
		}
	}
	
	public static int lazyCaterer(int val) {
		return ((val*val) + val + 2)/2;
	}
}