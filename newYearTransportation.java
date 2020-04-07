import java.util.*;
import java.io.*;

public class newYearTransportation{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int size = Integer.parseInt(st.nextToken());
        long goal = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());
        long[] cells = new long[size];

        for(int i=0; i < size-1; i++)
        {
            cells[i] = Integer.parseInt(st.nextToken());
        }


        int cell = 0;
        boolean success = false;
        while( cell < size-1 )
        {
            cell += cells[cell];

            if( cell == goal-1){
                System.out.println("YES");
                success = true;
                break;
            }

            if( cell > goal-1)
            {
                break;
            }
        }

        if( !success ) System.out.println("NO");
    }
}