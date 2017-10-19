package swingWorkSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class Swinging {
	JFrame f;

	Swinging(){
		f = new JFrame();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b = new JButton("click");
		b.setBounds(130, 400, 100, 40); // x, y, width, height
		JTextField tf = new JTextField();
		JLabel l1 = new JLabel("lable 1");
		l1.setBounds(130, 20, 60, 200);
		tf.setBounds(130, 20, 100, 50);
		//tf.setEnabled(false);
		b.addActionListener(new ActionListener(){
			public void	actionPerformed(ActionEvent e){
				String host = tf.getText();
				String ip;
				try {
					ip = java.net.InetAddress.getByName(host).getHostAddress();
					l1.setText(ip);
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		f.add(b);
		f.add(tf);
		f.add(l1);
		f.setSize(400, 1000); //width, height
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Swinging();
	}
}
