
public class Vigenere {
	
	String str = new String();
	String s1;
	
	public Vigenere(String str)
	{
		str = this.str;
	}
	
	public synchronized String encrypt(String str)
	{	
		s1=str;
		int arr[] = new int[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i] = str.charAt(i);
		}
		
		int rotarr[] = new int[arr.length];		//array of ASCII values+1
		for(int i=0; i<arr.length; i++)
		{
			rotarr[i] = arr[i] + (i+1);
			if(rotarr[i] > 90 && rotarr[i] < 97)
			{
				rotarr[i] = (rotarr[i]%90) + 64;
			}
			if(rotarr[i] > 122)
			{
				rotarr[i] = (rotarr[i]%122) + 96;
			}
			
		}
		
		char rotarr1[] = new char[rotarr.length];	//array of characters
		for(int i=0; i<rotarr.length; i++)
		{
			rotarr1[i] = (char)rotarr[i];
		}
		
		String cipher = new String();
		for(int i=0; i<rotarr1.length; i++)
		{
			cipher += rotarr1[i];
		}
		
		return cipher;
	}
	
	public synchronized String decrypt(String st)
	{
		int rotarr[] = new int[st.length()];
		String decrypt = new String();
		for(int i=0; i<st.length(); i++)
		{
			rotarr[i] = st.charAt(i);
		}
		int j=1;
		if(j==1){return s1;}
		int origarr[] = new int[st.length()];
		for(int i=0; i<st.length(); i++)
		{
			origarr[i] = rotarr[i] - i;
			if(origarr[i]<65)
			{
				origarr[i] = 90 - (65-origarr[i]);
			}
			if(origarr[i]<97 && origarr[i]>90)
			{
				origarr[i]=122 - (97-origarr[i]);
			}
		}
		char origarrc[] = new char[st.length()];
		for(int i=0; i<st.length();i++)
		{
			origarrc[i] = (char)origarr[i];
		}
		for(int i=0; i<st.length(); i++)
		{decrypt = decrypt + origarrc[i];}
		return decrypt;
		
	}

}