import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Login extends JDialog implements ActionListener{

	JLabel lblLoginName,lblPassword,lcipher;
	JTextField txtLoginName,tcipher;
	JPasswordField txtPassword;
	JButton btnLogin,btnCancel;
	Container cp;
	static String ans1,text1;
	
	public Login(JFrame owner,String title,boolean modal)
	{
		super(owner,title,modal);
		cp=getContentPane();
		cp.setLayout(new GridLayout(3,2,5,5));
		
		lblLoginName=new JLabel("User Name :");
		lblPassword=new JLabel("Password :");
		
		txtLoginName=new JTextField();
		txtPassword=new JPasswordField();
		
	
		btnLogin=new JButton("Login");
		btnCancel=new JButton("Cancel");
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);	
		
		
		cp.add(lblLoginName);
		cp.add(txtLoginName);
		cp.add(lblPassword);
		cp.add(txtPassword);
	
		cp.add(btnLogin);
		cp.add(btnCancel);
		
		
		setVisible(true);
		setSize(330,150);
		setTitle("Login...");		
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==btnLogin)
			{
				String s1=txtLoginName.getText();
				@SuppressWarnings("deprecation")
				String s2=txtPassword.getText();
			
				if(s1.equals("akkrz") && s2.equals("akkrz"))
				{
					
					JOptionPane.showMessageDialog(this,"Authentication Successful !\n"+"Text is :"+text1);		
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Authentication Failed !");
				}
			}
		
			
		if(ae.getSource()==btnCancel)
		{
			txtLoginName.setText("");
			txtPassword.setText("");			
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Login login=new Login(null,"jhg",false);
			
	}


	public void sendtext(String text)
	{
		text1=text;
	}
	
	
}
