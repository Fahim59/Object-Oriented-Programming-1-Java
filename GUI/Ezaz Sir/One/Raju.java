import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Raju extends JFrame{
	JLabel nameLabel,greetingLabel;
	JButton nameBtn,helloBtn,byeBtn;
	JPanel panel;
	Font myFont;
	
	public Raju(){
		super("Window that greets you");
		this.setSize(450,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont=new Font("Cambria",Font.PLAIN,16);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		nameLabel=new JLabel("Your Name:");
		nameLabel.setBounds(100,50,100,30);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);
		
		greetingLabel=new JLabel ("Hello/Bye raju");
		greetingLabel.setBounds(100,150,150,30);
		greetingLabel.setFont(myFont);
		panel.add(greetingLabel);
		
		nameBtn=new JButton("raju");
		nameBtn.setBounds(250,50,100,30);
		nameBtn.setFont(myFont);
		panel.add(nameBtn);
		
		helloBtn=new JButton("Hello");
		helloBtn.setBounds(100,100,100,30);
		helloBtn.setFont(myFont);
		panel.add(helloBtn);
		
		byeBtn=new JButton("Bye");
		byeBtn.setBounds(250,100,100,30);
		byeBtn.setFont(myFont);
		panel.add(byeBtn);
		
		this.add(panel);
	}
}
		