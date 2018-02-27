public class Transposition
{
   String st;
   char temp;
   
  public Transposition(String st)
   {
	 st=this.st;
   }
   public synchronized String encrypt(String st)
   {
	   StringBuffer s1=new StringBuffer(st);
	   s1.reverse();
	   st=new String(s1);
	   char a[]=st.toCharArray();
	  for(int j=0;j<2;j++)
	   {
		   for(int i=0;i<=st.length()/2;i++)
		   {
			   temp=a[i];
			   a[i]=a[i+2];
			   a[i+2]=temp;
		   }
	   }   
	   st=new String(a);
	   return st;
   }
   
   public synchronized String decrypt(String st)
   {
	 char a[]=st.toCharArray();
	for(int j=0;j<2;j++)
	   {
		   for(int i=st.length()/2;i>=0;i--)
		   {
			   temp=a[i];
			   a[i]=a[i+2];
			   a[i+2]=temp;
		   }
	   }
	 st=new String(a);
	 StringBuffer s1=new StringBuffer(st);
	 s1.reverse();
	 st=new String(s1);
	 return st;
	 
   }
   
}
