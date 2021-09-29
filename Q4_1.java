package Assignment3.java;
//char to string
public class Q4_1 {
	public static String toString(char[] a)
    {
        String string = new String(a);
        return string;
    }
  
    // Driver code
    public static void main(String args[])
    {
  
        // Character array
        char s[] = { 'S','U','M','E','G','H','A' };
  
        // Print final output of char arr[]->string
        System.out.println(toString(s));
    }

}
