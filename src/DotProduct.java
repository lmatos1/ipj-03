//1.4.18
// incomplete had trouble with nested for loops could not test.
public class DotProduct {
    int m = StdIn.readInt();
    int n= StdIn.readInt();
    int y= StdIn.readInt();
    int z= StdIn.readInt();

    int[][] a = new int[m][n];
    for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
    a[i][j] = 0;}


    int[][] b = new int[y][z];
       for(int i1 = 0; i1 < y; i1++)
        for(int j1 = 0; j1 < z; j1++)
            a[i1][j1] = 0;


    if (a[i]==b[i1]){
        int result= a[i]*b[i1];
        int result2=a[j]*b[j1];
        System.out.println(result+" "+result2);
    }
    else
        System.out.println("error");
}
}

