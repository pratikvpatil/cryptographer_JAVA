import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class MyDialog3 extends JDialog 
{
	JLabel l1,l2,l3,l4;
	Container cp;
	public String cipher;
public MyDialog3(JFrame owner,String title,boolean modal)
{
	super(owner,title,modal);
	setVisible(true);
	setSize(300,200);
	setLayout(new GridLayout(4,1,10,10));
	cp=getContentPane();
	l1=new JLabel("RSA :");
	l2=new JLabel("RSA is an algorithm for public-key cryptography that is based on the presumed difficulty of factoring large integers, the factoring problem. RSA stands for Ron Rivest, Adi Shamir and Leonard Adleman, who first publicly described the algorithm in 1977. Clifford Cocks, an English mathematician, had developed an equivalent system in 1973, but it wasn't declassified until 1997.[1] A user of RSA creates and then publishes the product of two large prime numbers, along with an auxiliary value, as their public key. The prime factors must be kept secret. Anyone can use the public key to encrypt a message, but with currently published methods, if the public key is large enough, only someone with knowledge of the prime factors can feasibly decode the message.[2] Whether breaking RSA encryption is as hard as factoring is an open question known as the RSA problem.");
	//l3=new JLabel("3)   SANCHIT NEVGI: 39");
	//l4=new JLabel("4)   PRATIK PATIL: 40.");
	cp.add(l1);
	cp.add(l2);
	
	
}
	
	
	

}
