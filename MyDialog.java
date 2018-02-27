import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class MyDialog extends JDialog 
{
	JLabel l1;
	JTextField f1;
	Container cp;
	public String cipher;
public MyDialog(JFrame owner,String title,boolean modal)
{
	super(owner,title,modal);
	setVisible(true);
	setSize(600,100);
	setLayout(new GridLayout(1,2,10,10));
	cp=getContentPane();
	l1=new JLabel("Cipher ");
	cp.add(l1);
	
	f1=new JTextField();
	cp.add(f1);
}
	
	public static void main(String[] args)
	{
	@SuppressWarnings("unused")
	MyDialog m1=new MyDialog(null,"pratik",false);
	}

	public void sendCipher(String cipher2) 
	{
	f1.setText(cipher2);	
		
	}

}
