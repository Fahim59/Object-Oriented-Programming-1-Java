import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class YesFrame extends JFrame implements ActionListener{
	JLabel label1,label2;                //label1=Are you a fool?,label2=Yes,you are a fool,label3=No,you are not a fool
	JButton againBtn,exitBtn;
	JPanel panel;
	Color myColor;
	Font myFont,myFont1;
	
	FirstFrame f;
	
	public YesFrame(){
		
		super("Fool Game");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.f=f;
		
		myFont=new Font("Cambria",Font.BOLD,20);
		myFont1=new Font("Cambria",Font.BOLD,13);
		
		panel=new JPanel();
		panel.setLayout(null);
		//panel.setBackground(Color.GRAY);
		
		
		label1=new JLabel("Are You a Fool?");
		label1.setBounds(220, 90, 150, 100);
		label1.setFont(myFont);
		panel.add(label1);
		
		label2=new JLabel("Yes, You are a Fool");
		label2.setBounds(205, 200, 170,30);
		label2.setBackground(Color.RED);
		label2.setOpaque(true); 
		label2.setFont(myFont);
		panel.add(label2);
		
		againBtn = new JButton("Again");
		againBtn.setBounds(210,260,70,30);
		againBtn.setFont(myFont1);
		againBtn.addActionListener(this);
		panel.add(againBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(300,260,70, 30);
		exitBtn.setFont(myFont1);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		
		if(againBtn.getText().equals(command))
		{
			FirstFrame f = new FirstFrame();
		    f.setVisible(true);
			this.setVisible(false);
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else
		{
			
		}
	}
}