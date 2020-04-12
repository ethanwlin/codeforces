import java.util.*;
import java.io.*;

public class team{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int numProbs = Integer.parseInt(st.nextToken());


        int solve = 0;
        for(int i=0; i < numProbs; i++){
            int cc = 0;
            st = new StringTokenizer(reader.readLine());
            for(int z = 0; z < 3; z++){
                if( Integer.parseInt(st.nextToken()) == 1){
                    cc++;
                }
                if( cc ==2 ){
                    solve++;
                    break;
                }
            }
        }

        System.out.println(solve);
    }
}