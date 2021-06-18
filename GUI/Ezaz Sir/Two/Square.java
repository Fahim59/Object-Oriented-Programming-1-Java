import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Square extends JFrame{
	JLabel numberLabel,resultLabel;
	JButton numberBtn,resultBtn;
	JPanel panel;
	Font myFont;
	
	public Square(){
		super("Square calculation");
		this.setSize(450,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont=new Font("Cambria",Font.PLAIN,16);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		numberLabel=new JLabel("A number:");
		numberLabel.setBounds(100,50,100,30);
		numberLabel.setFont(myFont);
		panel.add(numberLabel);
		
		resultLabel=new JLabel("25");
		resultLabel.setBounds(305,110,50,30);
		resultLabel.setFont(myFont);
		panel.add(resultLabel);
		
		resultBtn=new JButton("Calculate Square:");
		resultBtn.setBounds(100,110,165,30);
		resultBtn.setFont(myFont);
		panel.add(resultBtn);
		
		numberBtn=new JButton("5");
		numberBtn.setBounds(250,50,100,30);
		numberBtn.setFont(myFont);
		panel.add(numberBtn);
		
		this.add(panel);
	}
}
		
		
	