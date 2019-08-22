import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class InsertionSort {
public static void main(String[] args) {

int arr[]=new int[1024*4*4*4*4];	
int i=0;
try {
FileInputStream fstream=new FileInputStream("java5.txt");
DataInputStream in=new DataInputStream(fstream);
BufferedReader br=new BufferedReader(new InputStreamReader(in));
String s;
while((s=br.readLine())!=null)
{
arr[i]=Integer.parseInt(s);
i++;
}
int key,j;	
int n = arr.length;
long start=System.currentTimeMillis();
for (int t = 1; t < n; ++t) { 
     key = arr[t]; 
     j = t - 1; 

    while (j >= 0 && arr[j] > key) { 
        arr[j + 1] = arr[j]; 
        j = j - 1; 
    } 
    arr[j + 1] = key;
       
}

long end=System.currentTimeMillis();
System.out.println("excution time taken is :"+(end-start));

}

catch(Exception e)
 {
System.out.println("error:"+e.getMessage());
}

}
}
