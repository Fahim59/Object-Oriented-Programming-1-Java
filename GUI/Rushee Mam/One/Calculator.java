import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	JLabel oneLabel,twoLabel;
	JTextField oneTF,twoTF;
	JButton plusBtn,minusBtn,multiplicationBtn,divisionBtn;
	//JButton resetBtn,exitBtn;
	JPanel panel;
	Font myFont;
	int n1,n2,Answer;
	
	public Calculator(){
		super("Calculator");
		this.setSize(400,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		myFont=new Font("Cambria",Font.BOLD,20);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		oneLabel= new JLabel("Number 1");
		oneLabel.setBounds(50,30,100,50);
		oneLabel.setFont(myFont);
		panel.add(oneLabel);
		
		twoLabel=new JLabel("Number 2");
		twoLabel.setBounds(50,80,100,50);
		twoLabel.setFont(myFont);
		panel.add(twoLabel);
		
		oneTF=new JTextField();
		oneTF.setBounds(180,40,130,30);
		panel.add(oneTF);
		
		twoTF=new JTextField();
		twoTF.setBounds(180,90,130,30);
		panel.add(twoTF);
		
		plusBtn=new JButton("+");
		plusBtn.setBounds(50,150,50,40);
		plusBtn.addActionListener(this);
		panel.add(plusBtn);
		
		minusBtn=new JButton("-");
		minusBtn.setBounds(120,150,50,40);
		minusBtn.addActionListener(this);
		panel.add(minusBtn);
		
		multiplicationBtn=new JButton("*");
		multiplicationBtn.setBounds(190,150,50,40);
		multiplicationBtn.addActionListener(this);
		panel.add(multiplicationBtn);
		
		divisionBtn=new JButton("/");
		divisionBtn.setBounds(260,150,50,40);
		divisionBtn.addActionListener(this);
		panel.add(divisionBtn);
		
		/*resetBtn=new JButton("Reset");
		resetBtn.setBounds();
		resetBtn.addActionListener(this);
		panel.add(resetBtn);
		
		exitBtn=new JButton("Exit");
		exitBtn.setBounds();
		exitBtn.addActionListener(this);
		panel.add(exitBtn);*/
		
		this.add(panel);
	}
        public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0;
        try
        {
            a = Double.parseDouble(oneTF.getText());
        }
        catch (NumberFormatException e) {
            oneTF.setText("Invalid input");
        }
        try
        {
            b = Double.parseDouble(twoTF.getText());
        }
        catch (NumberFormatException e) {
            twoTF.setText("Invalid input");
        }
        if(ae.getSource()==plusBtn)
        {
            c=a+b;
			JOptionPane.showMessageDialog(this, "Summing..."+"\nResult: "+c);
        }
        if(ae.getSource()==minusBtn)
        {
            c=a-b;
			JOptionPane.showMessageDialog(this, "Subtracting..."+"\nResult: "+c);
        }
        if(ae.getSource()==multiplicationBtn)
        {
            c= a*b;
			JOptionPane.showMessageDialog(this, "Multiplying..."+"\nResult: "+c);
        }
        if(ae.getSource()==divisionBtn)
        {
            c= a/b;
			JOptionPane.showMessageDialog(this, "Dividing..."+"\nResult: "+c);
        }
        /*if(ae.getSource()==resetBtn)
        {
            oneTF.setText("0");
            twoTF.setText("0");
        }
        if(ae.getSource()==exitBtn)
        {
            System.exit(0);
        }*/	
    }
}