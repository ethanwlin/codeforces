import java.util.*;
import java.io.*;

public class wayTooLongWords{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] str = new String[n]; 
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(reader.readLine());
            str[i] = st.nextToken();
        }
        
        for(int i=0; i < n; i++){
            if( str[i].length() > 10){
                str[i] = str[i].charAt(0) + "" + (str[i].length()-2) + str[i].charAt(str[i].length()-1);
            }
            System.out.println(str[i]);
        }
    }
}
