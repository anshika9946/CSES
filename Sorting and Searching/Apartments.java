import java.io.*;
import java.util.*;
                  
//(Anshika Agarwal)                   
public class  Apartments {
                   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
         int n = sc.nextInt();
         int m = sc.nextInt();
         int k = sc.nextInt();
         int a[]=new int[n];
         int b[]=new int[m];
         ArrayList<Integer> ai=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         for(int i=0;i<m;i++)
         {
            b[i]=sc.nextInt();
            ai.add(b[i]);
         }
         Arrays.sort(a);
         Arrays.sort(b);
 
         int i = 0;
         int j = 0;
         int ans = 0;
         while (i < n && j < m) {
            if (Math.abs(a[i] - b[j]) <= k) {
				i++;
				j++;
				ans++;
			}
			// Apartment is too small -> increment apartment pointer
			else if (a[i] > b[j]) {
				j++;
			}
			// Apartment is too big -> increment applicant pointer
			else {
				i++;
			}
         }
         System.out.println(ans);

         
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
        String str = "Apartments"; 
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