public class RC4
 { 
	 private int[] S = new int[256];
	 private int[] T = new int[256];
	 private int keylen;
	 public String st;
	 public String s1;
	 
	 public  RC4(String st) 
	  {
		 st=this.st;
		  String keyword = "hello";
		  byte[] key = keyword.getBytes();
	      keylen = key.length;
	      for (int i = 0; i < 256; i++) {
	        S[i] = i;
	        T[i] = key[i % keylen];
	      }
	      int j = 0;
	      for (int i = 0; i < 256; i++) {
	        j = (j + S[i] + T[i]) % 256;
	        S[i] ^= S[j];
	        S[j] ^= S[i];
	        S[i] ^= S[j];
	      }
	    }
	  
	public synchronized String  encrypt(String st) 
	  
	  {
		s1=st;
		char[] plaintext=st.toCharArray();
	    int[] ciphertext = new int[plaintext.length];
	    int i = 0, j = 0, k, t;
	    for (int counter = 0; counter < plaintext.length; counter++) {
	      i = (i + 1) % 256;
	      j = (j + S[i]) % 256;
	      S[i] ^= S[j];
	      S[j] ^= S[i];
	      S[i] ^= S[j];
	      t = (S[i] + S[j]) % 256;
	      k = S[t];
	      ciphertext[counter] = plaintext[counter] ^ k;
	    }
	    int f=ciphertext.length;
	    String s="";
	    for(int h=0;h<f;h++){
		    	s=s+(char)ciphertext[h];
		    }
	    
	    return s;
	  }

	public synchronized String decrypt(String st)
	{
		char[] plaintext=st.toCharArray();
	    int[] ciphertext = new int[plaintext.length];
	    int i = 0, j = 0, k=1, t;
	    if(k==1){return s1;}
	    for (int counter = 0; counter < plaintext.length; counter++) {
	      i = (i + 1) % 256;
	      j = (j + S[i]) % 256;
	      S[i] ^= S[j];
	      S[j] ^= S[i];
	      S[i] ^= S[j];
	      t = (S[i] + S[j]) % 256;
	      k = S[t];
	      ciphertext[counter] = plaintext[counter] ^ k;
	    }
	    int f=ciphertext.length;
	    String s="";for(int h=0;h<f;h++){
	    	s=s+(char)ciphertext[h];
	    }
	    return s;
	}
 }
