import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener
{
	JButton Button;
	JLabel Label;
	
	MyFrame(){
		ImageIcon image = new ImageIcon("C:\\Users\\MR ODOI\\eclipse-workspace\\GUISwingJButton\\img\\ok.png");
		ImageIcon image1= new ImageIcon("C:\\Users\\MR ODOI\\eclipse-workspace\\GUISwingJButton\\img\\dude.png.png");
		
		Label= new JLabel();
		Label.setIcon(image1);
		Label.setBounds(150, 250, 100, 100);
		Label.setVisible(false);
		
	    Button=new JButton();
		Button.setBounds(100, 100, 250, 100);
		Button.addActionListener(this);
		Button.setText("I'm a Button!");
		Button.setFocusable(false);
		Button.setIcon(image);
		Button.setHorizontalTextPosition(JButton.CENTER);
		Button.setVerticalTextPosition(JButton.BOTTOM);
		Button.setFont(new Font("Comic Sans",Font.BOLD,25));
		Button.setForeground(Color.cyan);
		Button.setBackground(Color.LIGHT_GRAY);
		Button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(Button);
		this.add(Label);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Button) {
			//System.out.println("poo");
			Label.setVisible(true);
		}
		
	}

}
