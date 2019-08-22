import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class SelectionSort {
public static void main(String[] args) {

int arr[]=new int[1024*4*4*4*4];	
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
int min_idx	;
int n = arr.length; 

long start=System.currentTimeMillis(); 
for (int t = 0; t < n-1; t++) 
{  
     min_idx = t; 
    for (int j = t+1; j < n; j++) 
        if (arr[j] < arr[min_idx]) 
            min_idx = j;  
    int temp = arr[min_idx]; 
    arr[min_idx] = arr[t]; 
    arr[t] = temp; 
               }

     long end=System.currentTimeMillis();
System.out.println("excution time taken is :"+(end-start));
      
}
catch(Exception e) {
System.out.println("error:"+e.getMessage());
}

}
}