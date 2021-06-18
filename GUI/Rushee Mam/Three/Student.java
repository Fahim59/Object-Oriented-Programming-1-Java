import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame{
	JLabel lNameLabel,mNameLabel,fNameLabel,dobLabel,pobLabel,addressLabel,gradeLabel,fatherNameLabel,motherNameLabel,occupationLabel,genderLabel,ageLabel,sTypeLabel,nameLabel,numberLabel,relationshipLabel,emergencyLabel,requireLabel;
	JTextField lNameTF,mNameTF,fNameTF,dobTF,pobTF,addressTF,gradeTF,fatherNameTF,motherNameTF,occupationTF,genderTF,ageTF,sTypeTF,nameTF,numberTF,relationshipTF;
	JCheckBox c1,c2,c3,c4;
	JButton saveBtn,searchBtn,updateBtn,closeBtn,removeBtn;
	ButtonGroup cbg;
	JPanel panel;
	Font myFont,myFont1;
	
	public Student(){
		super("Student Profile");
		this.setSize(850,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont=new Font("Cambria",Font.PLAIN,20);
		myFont1=new Font("Cambria",Font.BOLD,20);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		lNameLabel=new JLabel("Last Name:");
		lNameLabel.setBounds(15,10,80,30);
		panel.add(lNameLabel);
		
		mNameLabel=new JLabel("Middle Name:");
		mNameLabel.setBounds(15,40,80,30);
		panel.add(mNameLabel);
		
		fNameLabel=new JLabel("First Name:");
		fNameLabel.setBounds(15,70,80,30);
		panel.add(fNameLabel);
		
		dobLabel=new JLabel("Date of Birth:");
		dobLabel.setBounds(15,100,80,30);
		panel.add(dobLabel);
		
		pobLabel=new JLabel("Place of Birth:");
		pobLabel.setBounds(15,130,80,30);
		panel.add(pobLabel);
		
		addressLabel=new JLabel("Address:");
		addressLabel.setBounds(15,160,80,30);
		panel.add(addressLabel);
		
		genderLabel=new JLabel("Gender:");
		genderLabel.setBounds(260,70,80,30);
		panel.add(genderLabel);
		
		ageLabel=new JLabel("Age:");
		ageLabel.setBounds(260,100,80,30);
		panel.add(ageLabel);
		
		sTypeLabel=new JLabel("Student Type:");
		sTypeLabel.setBounds(260,130,80,30);
		panel.add(sTypeLabel);
		
		
		
		gradeLabel=new JLabel("Grade:");
		gradeLabel.setBounds(15,220,80,30);
		panel.add(gradeLabel);
		
		fatherNameLabel=new JLabel("Father's Name:");
		fatherNameLabel.setBounds(15,250,100,30);
		panel.add(fatherNameLabel);
		
		occupationLabel=new JLabel("Occupation:");
		occupationLabel.setBounds(15,280,80,30);
		panel.add(occupationLabel);
		
		addressLabel=new JLabel("Address:");
		addressLabel.setBounds(15,310,80,30);
		panel.add(addressLabel);
		
		motherNameLabel=new JLabel("Mother's Name:");
		motherNameLabel.setBounds(15,340,100,30);
		panel.add(motherNameLabel);
		
		occupationLabel=new JLabel("Occupation:");
		occupationLabel.setBounds(15,370,80,30);
		panel.add(occupationLabel);
		
		addressLabel=new JLabel("Address:");
		addressLabel.setBounds(15,400,80,30);
		panel.add(addressLabel);
		
		
		
		emergencyLabel=new JLabel("In Case of Emergency");
		emergencyLabel.setBounds(550,15,200,30);
		emergencyLabel.setFont(myFont1);
		panel.add(emergencyLabel);
		
		nameLabel=new JLabel("Name:");
		nameLabel.setBounds(520,70,100,25);
		panel.add(nameLabel);
		
		addressLabel=new JLabel("Address:");
		addressLabel.setBounds(520,100,100,25);
		panel.add(addressLabel);
		
		numberLabel=new JLabel("Contract Number:");
		numberLabel.setBounds(520,130,100,25);
		panel.add(numberLabel);
		
		relationshipLabel=new JLabel("Relationship:");
		relationshipLabel.setBounds(520,160,100,25);
		panel.add(relationshipLabel);
		
		requireLabel=new JLabel("Requirements");
		requireLabel.setBounds(550,205,150,30);
		requireLabel.setFont(myFont1);
		panel.add(requireLabel);
		
		//Text Fields
		
		lNameTF=new JTextField();
		lNameTF.setBounds(130,15,100,25);
		panel.add(lNameTF);
		
		mNameTF=new JTextField();
		mNameTF.setBounds(130,45,100,25);
		panel.add(mNameTF);
		
		fNameTF=new JTextField();
		fNameTF.setBounds(130,75,100,25);
		panel.add(fNameTF);
	
		dobTF=new JTextField();
		dobTF.setBounds(130,105,100,25);
		panel.add(dobTF);
		
		pobTF=new JTextField();
		pobTF.setBounds(130,135,100,25);
		panel.add(pobTF);
		
		addressTF=new JTextField();
		addressTF.setBounds(130,165,100,40);
		panel.add(addressTF);
		
		genderTF=new JTextField();
		genderTF.setBounds(360,75,100,25);
		panel.add(genderTF);
		
		ageTF=new JTextField();
		ageTF.setBounds(360,105,100,25);
		panel.add(ageTF);
		
		sTypeTF=new JTextField();
		sTypeTF.setBounds(360,135,100,25);
		panel.add(sTypeTF);
		
		
		
		gradeTF=new JTextField();
		gradeTF.setBounds(130,225,100,25);
		panel.add(gradeTF);
		
		fatherNameTF=new JTextField();
		fatherNameTF.setBounds(130,255,100,25);
		panel.add(fatherNameTF);
		
		occupationTF=new JTextField();
		occupationTF.setBounds(130,285,100,25);
		panel.add(occupationTF);
		
		addressTF=new JTextField();
		addressTF.setBounds(130,315,100,25);
		panel.add(addressTF);
		
		motherNameTF=new JTextField();
		motherNameTF.setBounds(130,345,100,25);
		panel.add(motherNameTF);
		
		occupationTF=new JTextField();
		occupationTF.setBounds(130,375,100,25);
		panel.add(occupationTF);
		
		addressTF=new JTextField();
		addressTF.setBounds(130,405,100,25);
		panel.add(addressTF);
		
		
		nameTF=new JTextField();
		nameTF.setBounds(640,70,100,25);
		panel.add(nameTF);
		
		addressTF=new JTextField();
		addressTF.setBounds(640,100,100,25);
		panel.add(addressTF);
		
		numberTF=new JTextField();
		numberTF.setBounds(640,130,100,25);
		panel.add(numberTF);
		
		relationshipTF=new JTextField();
		relationshipTF.setBounds(640,160,100,25);
		panel.add(relationshipTF);
		
		//Check Box
		
		c1=new JCheckBox("Form 137");
		c1.setBounds(515,235,100,30);
		panel.add(c1);
		
		c2=new JCheckBox("Birth Certificate");
		c2.setBounds(515,260,150,30);
		panel.add(c2);
		
		c3=new JCheckBox("Report Card");
		c3.setBounds(515,285,100,30);
		panel.add(c3);
		
		c4=new JCheckBox("Certificate of Good Moral(transferees)");
		c4.setBounds(515,310,300,30);
		panel.add(c4);
		
		cbg = new ButtonGroup();  
		cbg.add(c1);
		cbg.add(c2);
		cbg.add(c3);
		
		//JButton
		
		saveBtn=new JButton("Save");
		saveBtn.setBounds(515,350,85,40);
		panel.add(saveBtn);
		
		searchBtn=new JButton("Search");
		searchBtn.setBounds(605,350,85,40);
		panel.add(searchBtn);
		
		updateBtn=new JButton("Update");
		updateBtn.setBounds(695,350,85,40);
		panel.add(updateBtn);
		
		closeBtn=new JButton("Close");
		closeBtn.setBounds(515,400,85,40);
		panel.add(closeBtn);
		
		removeBtn=new JButton("Remove");
		removeBtn.setBounds(605,400,85,40);
		panel.add(removeBtn);
		
		this.add(panel);
	}
}