import java.util.Scanner;
import java.util.Scanner;

public class NewClass9 {
        public static void main(String args[])
    {
     
     char temp,a,b;
     int output1,z;
      String str,x="";
        Scanner in=new Scanner(System.in);
    str=in.nextLine();
    char array[]=str.toCharArray();
    char c[]=new char[str.length()];
      for(int y=0;y<str.length()-1;y++)
       {
          
      
                    a=  array[y];
                     b= array[y+1];
              
                  temp=array[y+1];
                  c[y+1]= array[y];
                   c[y]=temp;
                   y=y+1;
              }
              
       
  for(int k=0;k<str.length();k++) {
    System.out.print(c[k]);
   
    
}
  System.out.println();

    }}
