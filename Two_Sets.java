import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Two_Sets {
                   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int n = sc.nextInt();

         int prod = (n * (n + 1)) / 2;

         if (prod % 2 != 0)
             {
                System.out.println("NO");
            }
         else {

             HashSet<Integer> set1 = new HashSet<>();
             HashSet<Integer> set2 = new HashSet<>();

             int i;
             int j = n;

             if (n % 2 == 0) {
                 i = 1;
             }
              else {
                 set1.add(1);
                 set1.add(2);
                 set2.add(3);
                 i = 4;
             }
             while (i <= j) {
                 set1.add(i);
                 ++i;
                 set2.add(i);
                 ++i;
                 set1.add(j);
                 --j;
                 set2.add(j);
                 --j;
             }
             System.out.println("YES");

             System.out.println(set1.size());

             StringBuilder str1 = new StringBuilder();

             for (int x : set1)
                {
                    str1.append(x).append(" ");
                }
             System.out.println(str1.toString());

             System.out.println(set2.size());

             StringBuilder str2 = new StringBuilder();
             for (int x : set2)
                { 
                    str2.append(x).append(" ");
                }
             System.out.println(str2.toString());
     }
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
        String str = ""; 
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