import acm.program.ConsoleProgram;

public class Multiply2Integers extends ConsoleProgram {
	public void run() {
		println("This program multiplies 2 integers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		println("Multiplication of n1 and n2 is " + (n1*n2));
	}
}
