import java.io.*;

public class watermelon{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int wght = Integer.parseInt(reader.readLine());

        if( wght%2 == 0 && wght > 2) System.out.println("YES");
        else System.out.println("NO");
    }
}