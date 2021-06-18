import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class Start extends JFrame implements ActionListener{
	
	JButton B1, B2, B3, B4, B5, B6, BRandom;
	JFrame frame, frame1, frame2;
	JPanel JP1, JP2, JP3, Jtemp;
	public void createfirstUI()
	{
		frame = new JFrame();
		frame.setTitle("Fool Game");
		frame.setBounds(300, 120, 700, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel JL1 = new JLabel("Are you a fool?");
		JL1.setFont(new Font("Serif", Font.PLAIN, 22));
		JL1.setBounds(210, 100, 150, 100);
		JL1.setLayout(null);
		
		B1 = new JButton("Yes");
		B1.setBounds(100,250,60, 30);
		B1.setLayout(null);
		B1.setBackground(Color.green);
		B1.addActionListener(this);
		
		B2 = new JButton("No");
		B2.setBounds(380,250,60, 30);
		B2.setLayout(null);
		B2.setBackground(Color.red);
		B2.addActionListener(this);
		
		JP1 = new JPanel();
		JP1.setBounds(75, 50, 550, 400);
		//JP1.setBackground(Color.gray);
		JP1.setLayout(null);
		JP1.add(B1);		
		JP1.add(B2);
		JP1.add(JL1);
		frame.add(JP1);
	}
	
	public void createYesUI()
	{
		frame1 = new JFrame();
		frame1.setTitle("Fool Game");
		frame1.setBounds(300, 120, 700, 500);
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel JL1 = new JLabel("Are you a fool?");
		JL1.setFont(new Font("Serif", Font.PLAIN, 22));
		JL1.setBounds(210, 100, 150, 100);
		JL1.setLayout(null);
		
		JLabel JTF1 = new JLabel("Yes, you are a fool");
		JTF1.setBounds(20, 0, 150, 30);
		JTF1.setLayout(null);
		JTF1.setBackground(Color.red);
		
		B3 = new JButton("Again");
		B3.setBounds(90, 320, 100, 30);
		B3.setLayout(null);
		B3.addActionListener(this);
		
		B4 = new JButton("Exit");
		B4.setBounds(380, 320, 100, 30);
		B4.setLayout(null);
		B4.addActionListener(this);
		
		Jtemp = new JPanel();
		Jtemp.setBounds(200, 250, 150, 30);
		Jtemp.setLayout(null);
		Jtemp.setBackground(Color.red);
		Jtemp.add(JTF1);
		
		JP2 = new JPanel();
		JP2.setBounds(75, 50, 550, 400);
		JP2.setLayout(null);
		JP2.add(B3);
		JP2.add(B4);
		JP2.add(JL1);
		JP2.add(Jtemp);
		frame1.add(JP2);
	}
	
	public void createNoUI()
	{
		frame2 = new JFrame();
		frame2.setTitle("Fool Game");
		frame2.setBounds(300, 120, 700, 500);
		frame2.setVisible(true);
		frame2.setLayout(null);
		frame2.setResizable(false);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel JL1 = new JLabel("Are you a fool?");
		JL1.setFont(new Font("Serif", Font.PLAIN, 22));
		JL1.setBounds(210, 100, 150, 100);
		JL1.setLayout(null);
		
		JLabel JTF1 = new JLabel("You are not a fool.");
		JTF1.setBounds(20, 0, 150, 30);
		JTF1.setLayout(null);
		JTF1.setBackground(Color.red);
		
		B5 = new JButton("Again");
		B5.setBounds(90, 320, 100, 30);
		B5.setLayout(null);
		B5.addActionListener(this);
		
		B6 = new JButton("Exit");
		B6.setBounds(380, 320, 100, 30);
		B6.setLayout(null);
		B6.addActionListener(this);
		
		Jtemp = new JPanel();
		Jtemp.setBounds(200, 250, 150, 30);
		Jtemp.setLayout(null);
		Jtemp.setBackground(Color.green);
		Jtemp.add(JTF1);
		
		JP3 = new JPanel();
		JP3.setBounds(75, 50, 550, 400);
		JP3.setLayout(null);
		JP3.add(B5);
		JP3.add(B6);
		JP3.add(JL1);
		JP3.add(Jtemp);
		frame2.add(JP3);
	}
	
	public void RandomButton()
	{
		Random R = new Random();
		BRandom = new JButton("No");
		BRandom.setBounds(R.nextInt(300), R.nextInt(200),60, 30);
		//BRandom.setBounds(350, 280 ,60, 30);
		BRandom.setLayout(null);
		BRandom.setBackground(Color.red);
		BRandom.addActionListener(this);
		JP1.add(BRandom);
		frame.add(JP1);
	}
	
	public static void main(String args[])
	{
		Start S = new Start();
		S.createfirstUI();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//JOptionPane.showMessageDialog(null, "Clicked!");
		if(e.getSource() == B1)
		{
			frame.dispose();
			this.createYesUI();
		}
		else if(e.getSource() == B2)
		{
			B2.setVisible(false);
			this.RandomButton();
		}
		else if(e.getSource() == B3)
		{
			this.createfirstUI();
			frame1.dispose();
		}
		else if(e.getSource() == B4)
		{
			frame1.dispose();
		}
		else if(e.getSource() == B5)
		{
			this.createfirstUI();
			frame2.dispose();
		}
		else if(e.getSource() == B6)
		{
			frame2.dispose();
		}
		else if(e.getSource() == BRandom)
		{
			frame.dispose();
			this.createNoUI();
		}
	}
}