import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First extends JFrame implements ActionListener,MouseListener{     //Inheriting JFrame and implementing AL,ML to create my own GUI
	JLabel userLabel,passLabel,imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn,exitBtn,signUpBtn;
	JRadioButton r1,r2;
	ButtonGroup bg,cbg;
	JCheckBox c1,c2,c3;
	JComboBox combo;
	JPanel panel;                                               //Tray where the gui will be placed
	ImageIcon img;
	
	Color myColor;
	Font myFont;
	
	public First(){
		super("My First GUI");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //EXIT_ON_CLOSE is a final variable thats why capital letter
		
		myColor=new Color(200,230,140);                       //Combination of (Red,Green,Blue)
		//myFont=new Font("Cambria",Font.ITALIC | Font.BOLD,10);
		myFont=new Font("Cambria",Font.BOLD,15);
		
		panel=new JPanel();
		panel.setLayout(null);                                 //We will not use any builtin things thats why null, will create by ownwill
		panel.setBackground(myColor);                         //Changing background color
		
		//The followings are Pattern
		
		userLabel=new JLabel("User Name :");                   //Creating object
		userLabel.setBounds(200,115,100,30);                  //SetBound(upperleft x coordinate,upperleft y coordinate,width,height)
		userLabel.setBackground(Color.YELLOW);
		userLabel.setForeground(Color.BLUE);                 //Foreground is used for changing Font color
		userLabel.setFont(myFont);
		userLabel.setOpaque(true);                           //This is an extra method which needed to be called to change the color of the Label
		panel.add(userLabel);                                //Adding on panel
		
		userTF=new JTextField();
		userTF.setBounds(350,115,100,30);                    //50 right
		userTF.setBackground(Color.CYAN);
		panel.add(userTF);
		
		passLabel=new JLabel("Password :");
		passLabel.setBounds(200,165,100,30);                //50 down
		passLabel.setBackground(Color.YELLOW);
		passLabel.setFont(myFont);
		passLabel.setOpaque(true);
		panel.add(passLabel);
		
		passPF=new JPasswordField();
		passPF.setBounds(350,165,100,30);
		passPF.setBackground(Color.PINK);
		panel.add(passPF);
		
		loginBtn=new JButton("Login");
		loginBtn.setBounds(200,215,100,30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		exitBtn=new JButton("Exit");
		exitBtn.setBounds(275,265,100,30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		signUpBtn=new JButton("Sign Up");
		signUpBtn.setBounds(350,215,100,30);
		signUpBtn.setBackground(Color.LIGHT_GRAY);
		//signUpBtn.addMouseListener(this);
		//signUpBtn.addActionListener(this);
		panel.add(signUpBtn);
		
		r1=new JRadioButton("OOP1-C");
		r1.setBounds(480,80,100,30);
		//r1.setBackground(Color.ORANGE);
		r1.setOpaque(false);                              //When background color changes the default color of radiobtn(White) becomes visible. By making false we removes the default color.
		panel.add(r1);
		
		r2=new JRadioButton("OOP1-G");
		r2.setBounds(480,110,100,30);
		r2.setBackground(Color.ORANGE);
		//r1.setOpaque(false); 
		panel.add(r2);
		
		bg=new ButtonGroup();                 //Creating a group for the buttons so that from each group one item can be selected. Otherwise without any group every button can be selected
		bg.add(r1);
		bg.add(r2);
		
		c1=new JCheckBox("FSIT");
		c1.setBounds(600,80,70,30);
		c1.setBackground(Color.GRAY);
		panel.add(c1);
		
		c2=new JCheckBox("FASS");
		c2.setBounds(600,110,70,30);
		//c1.setBackground(Color.GRAY);
		c2.setOpaque(false);
		panel.add(c2);
		
		c3=new JCheckBox("FBA");
		c3.setBounds(600,140,70,30);
		c3.setBackground(Color.GRAY);
		panel.add(c3);
		
		cbg = new ButtonGroup();  
		cbg.add(c1);
		cbg.add(c2);
		cbg.add(c3);
		
		String item[]={ "CSE","CSSE","SE","EEE","CoE" };    //Creating an array to add all the string combo items
		combo=new JComboBox(item);
		combo.setBounds(700,80,70,30);
		combo.setBackground(Color.MAGENTA);
		panel.add(combo);
		
		img=new ImageIcon("oop1c.jpg");
		imgLabel= new JLabel (img);
		imgLabel.setBounds(480,200,200,112);
		panel.add(imgLabel);
		
		/*img = new ImageIcon("background.jpg");          //full background
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 800, 450);
		panel.add(imgLabel);*/
		
		this.add(panel);                                   //Putting all the things in the tray
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);           //Background becomes blue and alphabet becomes white
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{
			String s1=userTF.getText();
			String s2=passPF.getText();
			String s3= " ";
			String s4= " ";
			
			if(r1.isSelected())
			{
				s3=r1.getText();
			}
			else if(r2.isSelected())
			{
				s3=r2.getText();
			}
			else
			{
				
			}
			
			if(c1.isSelected())
			{
				s4=c1.getText();
			}
			else if(c2.isSelected())
			{
				s4=c2.getText();
			}
			else if(c3.isSelected())
			{
				s4=c3.getText();
			}
			else
			{
				
			}
			
			String s5=combo.getSelectedItem().toString();
			
			JOptionPane.showMessageDialog(this, "Confirm Login?");             //(169-172) this transforms one gui to another gui
			SecondFrame sf = new SecondFrame(s1,s2,s3,s4,s5, this);
			sf.setVisible(true);
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