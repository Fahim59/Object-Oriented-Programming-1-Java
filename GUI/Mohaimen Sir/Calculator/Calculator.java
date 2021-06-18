import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	JTextField tF,memoryTextField;
	JButton offBtn,acBtn,mPlusBtn,mMinusBtn,mcBtn,mrBtn,oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn,zeroBtn,dotBtn,equalBtn,plusBtn,minusBtn,multiplicationBtn,divisionBtn,deleteBtn;
	//JButton msBtn,propBtn,sqrtBtn,perBtn,pmBtn,mBtn;
	JPanel panel;
	Color myColor;
	Font myFont;

	double result=0,memory=0,n1=0,num;
	int first=1,opt=2,oper1=0,oper2=0;
	static int operator=0;
	
	public Calculator(){
		super("Calculator");
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		myColor=new Color(0,0,0);
		myFont=new Font("Cambria",Font.BOLD,15);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		memoryTextField = new JTextField(5);
        memoryTextField.setText(" ");
        panel.add(memoryTextField);
		
		tF = new JTextField();
		tF.setBounds(25,55,320,65);
		tF.setBackground(Color.CYAN);
		panel.add(tF);
		
		offBtn=new JButton("OFF");
		offBtn.setBounds(25,140,125,65);
		offBtn.setBackground(Color.RED);
		offBtn.addActionListener(this);
		offBtn.setForeground(Color.WHITE);
		offBtn.setOpaque(true);
		offBtn.setFont(myFont);
		panel.add(offBtn);
		
		mPlusBtn=new JButton("M+");
		mPlusBtn.setBounds(25,225,60,65);
		mPlusBtn.setBackground(Color.BLUE);
		mPlusBtn.addActionListener(this);
		mPlusBtn.setForeground(Color.WHITE);
		mPlusBtn.setOpaque(true);
		mPlusBtn.setFont(myFont);
		panel.add(mPlusBtn);
		
		mMinusBtn=new JButton("M-");
		mMinusBtn.setBounds(25,310,60,65);
		mMinusBtn.setBackground(Color.BLUE);
		mMinusBtn.addActionListener(this);
		mMinusBtn.setForeground(Color.WHITE);
		mMinusBtn.setOpaque(true);
		mMinusBtn.setFont(myFont);
		panel.add(mMinusBtn);
		
		mcBtn=new JButton("MC");
		mcBtn.setBounds(25,395,60,65);
		mcBtn.setBackground(Color.BLUE);
		mcBtn.addActionListener(this);
		mcBtn.setForeground(Color.WHITE);
		mcBtn.setOpaque(true);
		mcBtn.setFont(myFont);
		panel.add(mcBtn);
		
		mrBtn=new JButton("MR");
		mrBtn.setBounds(25,480,60,65);
		mrBtn.setBackground(Color.BLUE);
		mrBtn.addActionListener(this);
		mrBtn.setForeground(Color.WHITE);
		mrBtn.setOpaque(true);
		mrBtn.setFont(myFont);
		panel.add(mrBtn);
		
		sevenBtn=new JButton("7");
		sevenBtn.setBounds(90,225,60,65);
		sevenBtn.setBackground(Color.WHITE);
		sevenBtn.addActionListener(this);
		sevenBtn.setForeground(Color.BLACK);
		sevenBtn.setOpaque(true);
		sevenBtn.setFont(myFont);
		panel.add(sevenBtn);
		
		fourBtn=new JButton("4");
		fourBtn.setBounds(90,310,60,65);
		fourBtn.setBackground(Color.WHITE);
		fourBtn.addActionListener(this);
		fourBtn.setForeground(Color.BLACK);
		fourBtn.setOpaque(true);
		fourBtn.setFont(myFont);
		panel.add(fourBtn);
		
		oneBtn=new JButton("1");
		oneBtn.setBounds(90,395,60,65);
		oneBtn.setBackground(Color.WHITE);
		oneBtn.addActionListener(this);
		oneBtn.setForeground(Color.BLACK);
		oneBtn.setOpaque(true);
		oneBtn.setFont(myFont);
		panel.add(oneBtn);
		
		zeroBtn=new JButton("0");
		zeroBtn.setBounds(90,480,60,65);
		zeroBtn.setBackground(Color.WHITE);
		zeroBtn.addActionListener(this);
		zeroBtn.setForeground(Color.BLACK);
		zeroBtn.setOpaque(true);
		zeroBtn.setFont(myFont);
		panel.add(zeroBtn);
		
		
		acBtn=new JButton("AC");
		acBtn.setBounds(155,140,125,65);
		acBtn.setBackground(Color.WHITE);
		acBtn.addActionListener(this);
		acBtn.setForeground(Color.BLACK);
		acBtn.setOpaque(true);
		acBtn.setFont(myFont);
		panel.add(acBtn);
		
		eightBtn=new JButton("8");
		eightBtn.setBounds(155,225,60,65);
		eightBtn.setBackground(Color.WHITE);
		eightBtn.addActionListener(this);
		eightBtn.setForeground(Color.BLACK);
		eightBtn.setOpaque(true);
		panel.add(eightBtn);
		
		fiveBtn=new JButton("5");
		fiveBtn.setBounds(155,310,60,65);
		fiveBtn.setBackground(Color.WHITE);
		fiveBtn.addActionListener(this);
		fiveBtn.setForeground(Color.BLACK);
		fiveBtn.setOpaque(true);
		fiveBtn.setFont(myFont);
		panel.add(fiveBtn);
		
		twoBtn=new JButton("2");
		twoBtn.setBounds(155,395,60,65);
		twoBtn.setBackground(Color.WHITE);
		twoBtn.addActionListener(this);
		twoBtn.setForeground(Color.BLACK);
		twoBtn.setOpaque(true);
		twoBtn.setFont(myFont);
		panel.add(twoBtn);
		
		dotBtn=new JButton(".");
		dotBtn.setBounds(155,480,60,65);
		dotBtn.setBackground(Color.WHITE);
		dotBtn.addActionListener(this);
		dotBtn.setForeground(Color.BLACK);
		dotBtn.setOpaque(true);
		dotBtn.setFont(myFont);
		panel.add(dotBtn);
		
		nineBtn=new JButton("9");
		nineBtn.setBounds(220,225,60,65);
		nineBtn.setBackground(Color.WHITE);
		nineBtn.addActionListener(this);
		nineBtn.setForeground(Color.BLACK);
		nineBtn.setOpaque(true);
		nineBtn.setFont(myFont);
		panel.add(nineBtn);
		
		sixBtn=new JButton("6");
		sixBtn.setBounds(220,310,60,65);
		sixBtn.setBackground(Color.WHITE);
		sixBtn.addActionListener(this);
		sixBtn.setForeground(Color.BLACK);
		sixBtn.setOpaque(true);
		sixBtn.setFont(myFont);
		panel.add(sixBtn);
		
		threeBtn=new JButton("3");
		threeBtn.setBounds(220,395,60,65);
		threeBtn.setBackground(Color.WHITE);
		threeBtn.addActionListener(this);
		threeBtn.setForeground(Color.BLACK);
		threeBtn.setOpaque(true);
		threeBtn.setFont(myFont);
		panel.add(threeBtn);
		
		equalBtn=new JButton("=");
		equalBtn.setBounds(220,480,60,65);
		equalBtn.setBackground(Color.WHITE);
		equalBtn.addActionListener(this);
		equalBtn.setForeground(Color.BLACK);
		equalBtn.setOpaque(true);
		equalBtn.setFont(myFont);
		panel.add(equalBtn);
		
		deleteBtn=new JButton("<");
		deleteBtn.setBounds(285,140,60,65);
		deleteBtn.setBackground(Color.GREEN);
		deleteBtn.addActionListener(this);
		deleteBtn.setForeground(Color.BLACK);
		deleteBtn.setOpaque(true);
		deleteBtn.setFont(myFont);
		panel.add(deleteBtn);
		
		divisionBtn=new JButton("/");
		divisionBtn.setBounds(285,225,60,65);
		divisionBtn.setBackground(Color.GREEN);
		divisionBtn.addActionListener(this);
		divisionBtn.setForeground(Color.BLACK);
		divisionBtn.setOpaque(true);
		divisionBtn.setFont(myFont);
		panel.add(divisionBtn);
		
		multiplicationBtn=new JButton("*");
		multiplicationBtn.setBounds(285,310,60,65);
		multiplicationBtn.setBackground(Color.GREEN);
		multiplicationBtn.addActionListener(this);
		multiplicationBtn.setForeground(Color.BLACK);
		multiplicationBtn.setOpaque(true);
		multiplicationBtn.setFont(myFont);
		panel.add(multiplicationBtn);
		
		minusBtn=new JButton("-");
		minusBtn.setBounds(285,395,60,65);
		minusBtn.setBackground(Color.GREEN);
		minusBtn.addActionListener(this);
		minusBtn.setForeground(Color.BLACK);
		minusBtn.setOpaque(true);
		minusBtn.setFont(myFont);
		panel.add(minusBtn);
		
		plusBtn=new JButton("+");
		plusBtn.setBounds(285,480,60,65);
		plusBtn.setBackground(Color.GREEN);
		plusBtn.addActionListener(this);
		plusBtn.setForeground(Color.BLACK);
		plusBtn.setOpaque(true);
		plusBtn.setFont(myFont);
		panel.add(plusBtn);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent evt)
    {
        String str;
		
        if(evt.getSource()== plusBtn)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(tF.getText());
                oper1=1;
            }
            else
            {
                n1=Double.parseDouble(tF.getText());
                oper2=1;
            }
            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }
        if(evt.getSource()==multiplicationBtn)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(tF.getText());
                oper1=4;
            }
            else
            {
                n1=Double.parseDouble(tF.getText());
                oper2=4;
            }
            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }
        if(evt.getSource()==divisionBtn)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(tF.getText());
                oper1=3;
            }
            else
            {
                n1=Double.parseDouble(tF.getText());
                oper2=3;
            }
            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }
        else if(evt.getSource()==minusBtn)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(tF.getText());
                oper1=2;
            }
            else
            {
                n1=Double.parseDouble(tF.getText());
                oper2=2;
            }
            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
 
        }
        else if(evt.getSource()==equalBtn)
        {
            double n1=Double.parseDouble(tF.getText());
            if(oper1==1)
                result=result+n1;
            else if(oper1==2)
                result=result-n1;
            else if(oper1==3)
                result=result/n1;
            else if(oper1==4)
                result=result*n1;
            else
                result=Double.parseDouble(tF.getText());
            num=result;
            str=String.valueOf(result);
            tF.setText(str);
        }
		else if(evt.getSource()==acBtn)
        {
            result=0;
            memory=0;
            first=1;
            opt=2;
            tF.setText("0");
            memoryTextField.setText(" ");
 
        }
        else if(evt.getSource()==mcBtn)
        {
            memory=0;
            tF.setText("0");
            memoryTextField.setText(" ");
        }
        else if(evt.getSource()==mrBtn)
        {
            str=String.valueOf(memory);
            tF.setText(str);
        }
        else if(evt.getSource()==zeroBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+0;
            else
                str=String.valueOf(" ")+0;
            opt=1;
            tF.setText(str);
 
        }
        else if(evt.getSource()==oneBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+1;
            else
                str=String.valueOf(" ")+1;
            opt=1;
            tF.setText(str);
 
        }
        else if(evt.getSource()==twoBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+2;
            else
                str=String.valueOf(" ")+2;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==threeBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+3;
            else
                str=String.valueOf(" ")+3;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==fourBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+4;
            else
                str=String.valueOf(" ")+4;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==fiveBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+5;
            else
                str=String.valueOf(" ")+5;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==sixBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+6;
            else
                str=String.valueOf(" ")+6;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==sevenBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+7;
            else
                str=String.valueOf(" ")+7;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==eightBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+8;
            else
                str=String.valueOf(" ")+8;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==nineBtn)
        {
            if(opt==1)
                str=String.valueOf(tF.getText())+9;
            else
                str=String.valueOf(" ")+9;
            opt=1;
            tF.setText(str);
        }
        else if(evt.getSource()==dotBtn)
        {
            str=String.valueOf(tF.getText())+".";
            tF.setText(str);
        }
		else if(evt.getSource()==deleteBtn)
        {
            int len;
            str= tF.getText();
            len=str.length();
            if(len>=1)
                str=str.substring(0,len-1);
            tF.setText(str);
        }
		else if(evt.getSource()==offBtn)
		{
			System.exit(0);
		}
		
		/*else if(evt.getSource()==msBtn)
        {
            memory=Double.parseDouble(tF.getText());
            str=String.valueOf("M");
            memoryTextField.setText(str);
        }
		//Action Corresponding to M button
		else if(evt.getSource()==mBtn)
        {
            memory=memory+Double.parseDouble(tF.getText());
        }
		//Action Corresponding to +/- button
        else if(evt.getSource()==pmBtn)
        {
            double n1=Double.parseDouble(tF.getText());
            n1=-n1;
            str=String.valueOf(n1);
            tF.setText(str);
        }
		//Action Corresponding to 1/x button
        else if(evt.getSource()==propBtn)
        {
            double n1=Double.parseDouble(tF.getText());
            n1=1/n1;
            str=String.valueOf(n1);
            tF.setText(str);
        }
		else if(evt.getSource()==sqrtBtn)
        {
            double n1=Double.parseDouble(tF.getText());
            n1=Math.sqrt(n1);
            str=String.valueOf(n1);
            tF.setText(str);
        }
        //Action Corresponding to % button
        else if(evt.getSource()==perBtn)
        {
            double n1=Double.parseDouble(tF.getText());
            n1=(n1*num)/100;
            str=String.valueOf(n1);
            tF.setText(str);
        }*/
		
    }
    void add1()
    {
        if(first==0)
            result=num=result+n1;
        String str=String.valueOf(result);
        tF.setText(str);
        opt=2;
        if(oper2!=0)
        {
            oper1=oper2;
            oper2=0;
        }
        first=0;
    }
    void sub()
    {
        if(first==0)
            result=num=result-n1;
        String str=String.valueOf(result);
        tF.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }
    void div()
    {
        if(first==0)
        {
            if(n1==0)
                tF.setText("Cannot divide by zero");
            else
                result=num=result/n1;
        }
        String str=String.valueOf(result);
        tF.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }
    void mul()
    {
        if(first==0)
            result=num=result*n1;
        String str=String.valueOf(result);
        tF.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }
}