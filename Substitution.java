public class Substitution
{
   String st;
   int key;
   
   public Substitution(String st)
   {
	 st=this.st;
   }
   public synchronized String encrypt(String st)
   {
	   char a[]=st.toCharArray();
	   key=(int)a[0];
	   for(int i=0;i<st.length()-1;i++)
		   {
			   a[i]=(char)(a[i]+key);
		   }  
	   st=new String(a);
	   return st;
   }
   
   public synchronized String decrypt(String st)
   {
	 char a[]=st.toCharArray();
	 for(int i=st.length()-1;i>=0;i--)
		   {
			  a[i]=(char)(a[i]-key);
		   }
	 st=new String(a);
	 return st;
	}
  
}
