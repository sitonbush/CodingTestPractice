
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main {
     public int solution(String str, char t) {
         int answer = 0;
         str= str.toLowerCase();
         t= Character.toLowerCase(t);

         for(char x: str.toCharArray()){
             if(x == t)
                 answer++;
         }

         return answer;
     }


     public static void main(String[] args) throws IOException {
         Main T = new Main();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //String 읽기
         String str = br.readLine();
         char c = br.readLine().charAt(0);
         System.out.println(T.solution(str, c));
     }
}
