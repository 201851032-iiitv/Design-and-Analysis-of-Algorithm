import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class BubbleSort {
public static void main(String[] args) {
int arr[]=new int[262144];	
int i=0;
try {
FileInputStream fstream=new FileInputStream("sort5.txt");
DataInputStream in=new DataInputStream(fstream);
BufferedReader br=new BufferedReader(new InputStreamReader(in));
String s;
while((s=br.readLine())!=null)
{
arr[i]=Integer.parseInt(s);
i++;
}	


       int n = arr.length; 
       int temp;

       long start=System.currentTimeMillis();
       for (int k = 0; k < n-1; k++) 
           for (int j = 0; j < n-k-1; j++) 
               if (arr[j] > arr[j+1]) 
               { 
            
                   temp = arr[j]; 
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp; 
               }
              
               long end=System.currentTimeMillis();
               System.out.println("excution time taken is :"+(end-start)); 
             
       
                              }

catch(Exception e) {
System.out.println("error:"+e.getMessage());
}
}
}