import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Gray_Code {
    static void generateGrayarr(int n)
    {

        if (n <= 0)
            return;
 
        ArrayList<String> arr = new ArrayList<String> ();
     

        arr.add("0");
        arr.add("1");
   
        int i, j;
        for (i = 2; i < (1<<n); i = i<<1)
        {

            for (j = i-1 ; j >= 0 ; j--)
                arr.add(arr.get(j));
              for (j = 0 ; j < i ; j++)
                arr.set(j, "0" + arr.get(j));
     

            for (j = i ; j < 2*i ; j++)
                arr.set(j, "1" + arr.get(j));
        }
     

        for (i = 0 ; i < arr.size() ; i++ )
            System.out.println(arr.get(i));
    }
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int t = sc.nextInt();
generateGrayarr(t);
     }
                                    
                                     
                                   
                  
                   
//#########################################################################################################
    static int Intmax(){return Integer.MAX_VALUE;} 
    static int Intmint(){ return Integer.MIN_VALUE;}
    static char get(String s, int i) {char c=s.charAt(i);return c;}
    static int max(int a, int b){return Math.max(a, b);}
    static int min(int a, int b){return Math.min(a, b);}
static void print(int a[]){int n=a.length;for(int i=0;i<n;i++){System.out.print(a[i]);}}
    //FastReader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
        String str = "Gray_Code"; 
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken(
);
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        //Input Array elements
        int[] intArray(int n){
            int[] arr = new int[n];
            for(int i =0; i < n; i ++){
                arr[i] = nextInt();
            }
            return arr;
        }
        //Input ArrayList elements
        ArrayList<Integer> intA(int n){
            ArrayList<Integer> a=new ArrayList<>();
            for(int i =0; i < n; i ++){
                a.add(nextInt());
            }
            return a;
        }
            }
        }