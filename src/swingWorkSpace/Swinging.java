package swingWorkSpace;
import javax.swing.*;

public class Swinging {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40); // x, y, width, height

		f.add(b);
		f.setSize(400, 500); //width, height
		f.setVisible(true);
		f.setLayout(null);
	}
}
