import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContractEditor extends JFrame{
	JLabel nameLabel,idLabel,ageLabel,mblOptLabel,mblNumLabel,genderLabel;
	JButton saveBtn;
	JTextField nameTF,idTF,ageTF,mblNumTF,genderTF;
	JComboBox combo;
	JPanel panel;
	Font myFont;
	
	public ContractEditor(){
		this.setSize(550,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont=new Font("Cambria",Font.BOLD,15);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		nameLabel=new JLabel("Name");
		nameLabel.setBounds(25,30,125,30);
		nameLabel.setFont(myFont);
		panel.add(nameLabel);
		
		nameTF=new JTextField();
		nameTF.setBounds(220,30,125,30);
		panel.add(nameTF);
		
		idLabel=new JLabel("Person ID");
		idLabel.setBounds(25,80,125,30);
		idLabel.setFont(myFont);
		panel.add(idLabel);
		
		idTF=new JTextField();
		idTF.setBounds(220,80,125,30);
		panel.add(idTF);
		
		ageLabel=new JLabel("Age");
		ageLabel.setBounds(25,130,125,30);
		ageLabel.setFont(myFont);
		panel.add(ageLabel);
		
		ageTF=new JTextField();
		ageTF.setBounds(220,130,125,30);
		panel.add(ageTF);
		
		mblOptLabel=new JLabel("Mobile Operator");
		mblOptLabel.setBounds(25,180,125,30);
		mblOptLabel.setFont(myFont);
		panel.add(mblOptLabel);
		
		String item[]={"Grameen Phone","Banglalink","Airtel","Teletalk","Robi"};
		combo=new JComboBox(item);
		combo.setBounds(220,180,125,30);
		panel.add(combo);
		
		mblNumLabel=new JLabel("Mobile Number");
		mblNumLabel.setBounds(25,230,125,30);
		mblNumLabel.setFont(myFont);
		panel.add(mblNumLabel);
		
		mblNumTF=new JTextField();
		mblNumTF.setBounds(220,230,125,30);
		panel.add(mblNumTF);
		
		genderLabel=new JLabel("Gender");
		genderLabel.setBounds(25,280,125,30);
		genderLabel.setFont(myFont);
		panel.add(genderLabel);
		
		genderTF=new JTextField();
		genderTF.setBounds(220,280,125,30);
		panel.add(genderTF);
		
		
		saveBtn=new JButton("Save");
		saveBtn.setBounds(250,330,85,30);
		saveBtn.setFont(myFont);
		panel.add(saveBtn);

		this.add(panel);
	}
}