import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int countNot = 0;
    public static int count = 0;
// new version
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<String> number = Arrays.asList(bufferedReader.readLine().split(" "));
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < n; i++) {
            String nnn = number.get(i);
            int nn = Integer.parseInt(nnn);
            if (nn % 2 == 0) {
                count++;
                temp = number.indexOf(nnn);
            } else {
                countNot++;
                temp1 = number.indexOf(nnn);
            }
        }
        //aaa
        if (count > countNot)
            System.out.println(temp1+1);
        else
            System.out.println(temp+1);
    }
}

