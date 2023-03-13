import java.io.*;
import java.util.*;
import java.util.Map.Entry;
                  
//(Anshika Agarwal)                   
public class  Main {
    public static String getPalindrome(String str)
    {
         
        
        HashMap<Character,
                Integer> counting = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            if (counting.containsKey(ch))
            {
                counting.put(ch, counting.get(ch) + 1);
            }
            else
            {
                counting.put(ch, 1);
            }
        }
         
        
        Integer oddCount = 0;
        Character oddChar = 0;
         
        for(Entry<Character, Integer> itr : counting.entrySet())
        {
            if (itr.getValue() % 2 != 0)
            {
                oddCount++;
                oddChar = itr.getKey();
            }
        }

        if (oddCount > 1 || oddCount == 1 &&
            str.length() % 2 == 0)
        {
            return "NO SOLUTION";
        }

        StringBuilder firstHalf=new StringBuilder("");
 StringBuilder lastHalf=new StringBuilder("");
        for(Entry<Character, Integer> itr : counting.entrySet())
        {

            StringBuilder ss=new StringBuilder("");
            for(int i = 0; i < itr.getValue() / 2; i++)
            {
                
                ss.append(itr.getKey());
            }

            firstHalf.append(ss);
            lastHalf=(ss.append(lastHalf));
        }
         

        return (oddCount == 1) ?
               ( (firstHalf.append(oddChar.toString()).append(lastHalf)).toString()) :
               (firstHalf.append(lastHalf).toString());
    }   
     public static void main(String args[]) throws IOException {
                   
         FastReader sc = new FastReader();
                   
                   
String s=sc.next();
System.out.println(getPalindrome(s));
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