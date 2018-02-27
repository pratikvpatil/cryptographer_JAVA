import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class MyDialog2 extends JDialog 
{
	JLabel l1,l2,l3,l4;
	Container cp;
	public String cipher;
public MyDialog2(JFrame owner,String title,boolean modal)
{
	super(owner,title,modal);
	setVisible(true);
	setSize(300,200);
	setLayout(new GridLayout(4,1,10,10));
	cp=getContentPane();
	l1=new JLabel("1)   ANAND SONAWANE: 37");
	l2=new JLabel("2)   ROHIT PATIL: 38");
	l3=new JLabel("3)   SANCHIT NEVGI: 39");
	l4=new JLabel("4)   PRATIK PATIL: 40.");
	cp.add(l1);
	cp.add(l2);
	cp.add(l3);
	cp.add(l4);
	
}
	public static void main(String[] a)
	{
		MyDialog m=new MyDialog(null,"pratik",false);
	}
	
	

}
