import java.lang.*;
import javax.swing.*;

public class Calculator extends JFrame{
	JTextField tF;
	JButton oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn,zeroBtn,plusBtn,minusBtn,multiplicationBtn,cBtn,mBtn;
	JPanel panel;
	
	public Calculator(){
		this.setSize(400,370);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		tF=new JTextField();
		tF.setBounds(25,50,330,50);
		panel.add(tF);
		
		oneBtn=new JButton("1");
		oneBtn.setBounds(25,120,50,40);
		panel.add(oneBtn);
		
		fourBtn=new JButton("4");
		fourBtn.setBounds(25,190,50,40);
		panel.add(fourBtn);
		
		sevenBtn=new JButton("7");
		sevenBtn.setBounds(25,260,50,40);
		panel.add(sevenBtn);
		
		twoBtn=new JButton("2");
		twoBtn.setBounds(95,120,50,40);
		panel.add(twoBtn);
		
		fiveBtn=new JButton("5");
		fiveBtn.setBounds(95,190,50,40);
		panel.add(fiveBtn);
		
		eightBtn=new JButton("8");
		eightBtn.setBounds(95,260,50,40);
		panel.add(eightBtn);
		
		threeBtn=new JButton("3");
		threeBtn.setBounds(165,120,50,40);
		panel.add(threeBtn);
		
		sixBtn=new JButton("6");
		sixBtn.setBounds(165,190,50,40);
		panel.add(sixBtn);
		
		nineBtn=new JButton("9");
		nineBtn.setBounds(165,260,50,40);
		panel.add(nineBtn);
		
		zeroBtn=new JButton("0");
		zeroBtn.setBounds(235,120,50,40);
		panel.add(zeroBtn);
		
		cBtn=new JButton("C");
		cBtn.setBounds(235,190,50,40);
		panel.add(cBtn);
		
		mBtn=new JButton("M");
		mBtn.setBounds(235,260,50,40);
		panel.add(mBtn);
		
		plusBtn=new JButton("+");
		plusBtn.setBounds(305,120,50,40);
		panel.add(plusBtn);
		
		minusBtn=new JButton("-");
		minusBtn.setBounds(305,190,50,40);
		panel.add(minusBtn);
		
		multiplicationBtn=new JButton("*");
		multiplicationBtn.setBounds(305,260,50,40);
		panel.add(multiplicationBtn);
		
		this.add(panel);
	}
}
	