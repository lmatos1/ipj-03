// 1.4.14
import java.util.Arrays;

public class Transposition {
    public static void main(String[] args) {
        int[][] a= {{99,98,92,94,99,90,76,92,97,89},
                    {85,57,77,32,34,46,59,66,71,29},
                    {98,78,76,11,22,54,88,89,24,38}};

        System.out.println(Arrays.deepToString(a).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
