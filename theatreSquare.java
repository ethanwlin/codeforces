import java.util.*;
import java.io.*;

public class theatreSquare{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int sq1 = Integer.parseInt(st.nextToken());
        int sq2 = Integer.parseInt(st.nextToken());
        int stone = Integer.parseInt(st.nextToken());

        System.out.println((long)(Math.ceil(sq1/(double)stone) * Math.ceil(sq2/(double)stone)));
    }
}