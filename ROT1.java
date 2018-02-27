
public class ROT1 {
	
	String str = new String();
	
	public ROT1(String str)
	{
		str = this.str;
	}
	
	public synchronized String encrypt(String str)
	{
		int arr[] = new int[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i] = str.charAt(i);
		}
		
		int rotarr[] = new int[arr.length];		//array of ASCII values+1
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 122)
			{
				rotarr[i] = 97;
				continue;
			}
			if(arr[i] == 90)
			{
				rotarr[i] = 65;
				continue;
			}
			rotarr[i] = arr[i] + 1;
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
		int arr[] = new int[st.length()];
		for(int i=0; i<st.length(); i++)
		{
			arr[i] = st.charAt(i);
		}
		
		int darr[] = new int[st.length()];
		for(int i=0; i<st.length(); i++)
		{
			if(darr[i] == 65)
			{
				darr[i] = 90;
				continue;
			}
			if(darr[i]==97)
			{
				darr[i] = 122;
				continue;
			}
			darr[i] = arr[i]-1;
		}
		
		char darrc[] = new char[st.length()];
		for(int i=0; i<st.length(); i++)
		{
			darrc[i] = (char)darr[i];
		}
		
		String decrypt = new String();
		
		for(int i=0; i<st.length(); i++)
		{
			decrypt += darrc[i];
		}
		
		return decrypt;
	}

}
