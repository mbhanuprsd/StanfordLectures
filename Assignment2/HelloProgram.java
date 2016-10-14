import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloProgram extends GraphicsProgram{
	public void run() {
		GLabel label = new GLabel("Hi, I'm Bhanu!", 100, 50);
		label.setFont("SansSerif-34");
		label.setColor(Color.GREEN);
		add(label);
	}
}
