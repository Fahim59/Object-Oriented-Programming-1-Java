import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FirstFrame extends JFrame implements ActionListener{
	JLabel label1;
	JButton yesBtn,noBtn,randomBtn;
	JPanel panel;
	Color myColor;
	Font myFont,myFont1;
	
	public FirstFrame(){
		
		super("Fool Game");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont=new Font("Cambria",Font.BOLD,20);
		myFont1=new Font("Cambria",Font.BOLD,13);
		
		panel=new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.GRAY);
		
		
		label1=new JLabel("Are You a Fool?");
		label1.setBounds(220, 90, 150, 100);
		label1.setFont(myFont);
		panel.add(label1);
		
		yesBtn=new JButton("Yes");
		yesBtn.setBounds(220,190,60, 30);
		yesBtn.setBackground(Color.GREEN);
		yesBtn.setFont(myFont1);
		yesBtn.addActionListener(this);
		panel.add(yesBtn);
		
		noBtn=new JButton("No");
		noBtn.setBounds(300,190,60, 30);
		noBtn.setBackground(Color.RED);
		noBtn.setFont(myFont1);
		noBtn.addActionListener(this);
		panel.add(noBtn);
		
		this.add(panel);
	}
	
	public void RandomButton()
	{
		Random R = new Random();
		randomBtn = new JButton("No");
		randomBtn.setBounds(R.nextInt(300), R.nextInt(200),60, 30);
		//randomBtn.setBounds(350, 280 ,60, 30);
		randomBtn.setBackground(Color.red);
		randomBtn.addActionListener(this);
		panel.add(randomBtn);
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		
		if(yesBtn.getText().equals(command))
		{
			YesFrame yf = new YesFrame();
		    yf.setVisible(true);
			this.setVisible(false);
		}
		else if(noBtn.getText().equals(command))
		{
			//noBtn.setVisible(false);
			//this.RandomButton();
			//randomBtn.setVisible(true);
			NoFrame nf=new NoFrame();
			nf.setVisible(true);
			this.setVisible(false);
			
		}
		else if(randomBtn.getText().equals(command))
		{
			NoFrame nf=new NoFrame();
			nf.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
}