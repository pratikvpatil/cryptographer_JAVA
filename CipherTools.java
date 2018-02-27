import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class CipherTools extends JFrame implements ActionListener 
{

	Container cp;
	JLabel ltxt,lcipher,lcipher1;
	JTextField ttxt,tcipher,tcipher1;
	JButton bencrypt,bdecrypt;
	JMenuBar b1;
	JMenu file,tools,about,color,filechoose;
	JFileChooser choose;
	JRadioButton rsa,yellow,red,blue,pink,green,transposition,substitution,RC4,ROT1,Vigenere;
	JMenuItem exit,nw,iabout,algo,new1;
	MyDialog dlg;
	Login ln;
	public static String cipher,source,text;
	
	public static RSA r;
	public static Transposition trans;
	public static Substitution sub;
	public static RC4 rc;
	public static ROT1 ro;
	public static Vigenere v;
	public CipherTools()
	{
		cp=getContentPane();
		setVisible(true);
		setSize(550,175);
		setTitle("Cipher Tools :) ");
		setLayout(new GridLayout(3,2,5,5));
		cp.setBackground(Color.yellow);
		//-----------------------------------------------------------------------
		
		b1=new JMenuBar();
		setJMenuBar(b1);
		
		file=new JMenu("File");
		b1.add(file);
		
		filechoose=new JMenu("Import File");
		b1.add(filechoose);
		
		color=new JMenu("Color");
		b1.add(color);
		
		choose=new JFileChooser("Import file");
		filechoose.add(choose);
		
		yellow=new JRadioButton("yellow");
		blue=new JRadioButton("Blue");
		green=new JRadioButton("Green");
		pink=new JRadioButton("Pink");
		red=new JRadioButton("Red");
		color.add(red);
		color.add(blue);
		color.add(green);
		color.add(pink);
		color.add(yellow);
		red.addActionListener(this);
		yellow.addActionListener(this);
		pink.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		
		tools=new JMenu("Tools");
		b1.add(tools);
		
		
		new1=new JMenuItem("New");
		file.add(new1);
		new1.addActionListener(this);
		
		about=new JMenu("About");
		b1.add(about);
		
		iabout =new JMenuItem("Project made by");
		about.add(iabout);
		iabout.addActionListener(this);
		
		algo=new JMenuItem("Algorithms");
		about.add(algo);
		algo.addActionListener(this);
		
		exit=new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(this);
		//...............................................................................
		rsa=new JRadioButton("RSA");
		tools.add(rsa);
		rsa.addActionListener(this);
		
		RC4=new JRadioButton("RC4");
		tools.add(RC4);
		RC4.addActionListener(this);
		
		substitution=new JRadioButton("Substitution");
		tools.add(substitution);
		substitution.addActionListener(this);
		
		transposition=new JRadioButton("Transposition");
		tools.add(transposition);
		transposition.addActionListener(this);
		
		ROT1=new JRadioButton("ROT1");
		tools.add(ROT1);
		ROT1.addActionListener(this);
		
		Vigenere=new JRadioButton("Vigenere");
		tools.add(Vigenere);
		Vigenere.addActionListener(this);
		
	//.........................................................................	
				
		ltxt = new JLabel("Enter text to be Encrypted in the text field !!!! ");
		cp.add(ltxt);
		
		ttxt=new JTextField();
		cp.add(ttxt);
		
		
		lcipher=new JLabel("Enter the cipher :");
		tcipher=new JTextField();
		//source=ttxt.get
		
		cp.add(lcipher);
		cp.add(tcipher);
		bencrypt=new JButton("Encrypt");
		cp.add(bencrypt);
		bencrypt.addActionListener(this);
		
		bdecrypt= new JButton("Decrypt");
		cp.add(bdecrypt);
		bdecrypt.addActionListener(this);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if (ae.getSource()==red)
		{
			cp.setBackground(Color.RED);
		}
		if (ae.getSource()==blue)
		{
			cp.setBackground(Color.BLUE);
		}
		if (ae.getSource()==green)
		{
			cp.setBackground(Color.GREEN);
		}
		if (ae.getSource()==pink)
		{
			cp.setBackground(Color.PINK);
		}
		if (ae.getSource()==yellow)
		{
			cp.setBackground(Color.YELLOW);
		}
		if (ae.getSource()==algo)
		{
			@SuppressWarnings("unused")
			MyDialog3 x=new MyDialog3(this,"About Us",false);
		}
		
		if (ae.getSource()==iabout)
		{
			@SuppressWarnings("unused")
			MyDialog2 x=new MyDialog2(this,"About Us",false);
		}
		if (ae.getSource()==new1)
		{
			@SuppressWarnings("unused")
			CipherTools cpy=new CipherTools();
		}
		if (ae.getSource()==bencrypt)
		{
			dlg=new MyDialog(this,"Encrypting.....!!",false);
			dlg.sendCipher(cipher);

		}
		if (ae.getSource()==exit)
		{
			JOptionPane.showConfirmDialog(this, "are u sure ??");
			System.exit(0);
		}
		
		if (ae.getSource()==bdecrypt)
		{
			if(tcipher.getText().equals(cipher))
			{
			
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Error !!!!!");
				System.exit(0);
			}
			ln=new Login(this,"Sign in !!",false);
			ln.sendtext(text);
		}
		//........................................................................
		if(ae.getSource()==rsa)
		{
			 source=ttxt.getText();
			 r=new RSA(source);
			 cipher=r.encrypt(source);
		
			 text=r.decrypt(cipher);
			 
		}
		if(ae.getSource()==transposition)
		{
			 source=ttxt.getText();
			 trans=new Transposition(source);
			 cipher=trans.encrypt(source);
		
			 text=trans.decrypt(cipher);
			 
		}
		if(ae.getSource()==substitution)
		{
			 source=ttxt.getText();
			 sub=new Substitution(source);
			 cipher=sub.encrypt(source);
		
			 text=sub.decrypt(cipher);
			 
		}
		if(ae.getSource()==RC4)
		{
			 source=ttxt.getText();
			 rc=new RC4 (source);
			 cipher=rc.encrypt(source);
		
			 text=rc.decrypt(cipher);
			 
		}
		if(ae.getSource()==ROT1)
		{
			 source=ttxt.getText();
			 ro=new ROT1(source);
			 cipher=ro.encrypt(source);
		
			 text=ro.decrypt(cipher);
			 
		}
		if(ae.getSource()==Vigenere)
		{
			 source=ttxt.getText();
			 v=new Vigenere(source);
			 cipher=v.encrypt(source);
		
			 text=v.decrypt(cipher);
			 
		}
		//................................................................................
		
	}
	public static void main(String[] args) 
	{
	@SuppressWarnings("unused")
	CipherTools c1=new CipherTools();
	}
	

}
