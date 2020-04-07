import java.util.*;
import java.io.*;

public class nextRound{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int numPpl = Integer.parseInt(st.nextToken());
        int place = Integer.parseInt(st.nextToken());
        int placeScore = Integer.MAX_VALUE;
        int cc = 0;

        st = new StringTokenizer(reader.readLine());
        int[] scores = new int[numPpl];
        for(int i=0; i < numPpl; i++)
        {
            scores[i] = Integer.parseInt(st.nextToken());
            if( i == place-1) placeScore = scores[i];
        }

        for(int i=0; i < numPpl; i++)
        {
            if( scores[i] > 0 && scores[i] >= placeScore) cc++;
        }

        System.out.println(cc);
    }
}