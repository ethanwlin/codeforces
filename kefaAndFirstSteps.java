import java.util.*;
import java.io.*;

public class kefaAndFirstSteps{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int numDays = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());

        //makes array of all profits
        long[] days = new long[numDays];
        for(int i=0; i < numDays; i++){
            days[i] = Integer.parseInt(st.nextToken());
        }

        long maxSeg = 0;
        long curSeg = 1;
        for(int i=0; i < numDays-1; i++){
            if( days[i] <= days[i+1]){
                curSeg++;
            }else if(curSeg > maxSeg){
                maxSeg = curSeg;
                curSeg = 1;
            }
        }

        if(curSeg > maxSeg){
            maxSeg = curSeg;
        }
        System.out.println(maxSeg);
    }
}