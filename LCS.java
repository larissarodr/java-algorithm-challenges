/*  Given two sequences, find the length of longest subsequence present in both of them. */

public class LongestCommonSubsequence  {
  
    public static void main(String[] args) 
    { 
        LongestCommonSubsequence lcs = new LongestCommonSubsequence(); 
        String s1 = "ABAZDC"; //should return 4 (ABAD)
        String s2 = "BACBAD"; 
      
        char[] X=s1.toCharArray(); 
        char[] Y=s2.toCharArray(); 
        int m = X.length; 
        int n = Y.length; 
      
        System.out.println("Length of LCS is" + " " + 
                                      lcs.lcs( X, Y, m, n ) ); 
    }
    
    int lcs( char[] X, char[] Y, int m, int n ){ 
        int L[][] = new int[m+1][n+1]; 
      
        /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
             that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++) 
        { 
          for (int j=0; j<=n; j++) 
          {
              System.out.println("i: "+i);
              System.out.println("j: "+j);
            if (i == 0 || j == 0) 
                L[i][j] = 0; 
            else if (X[i-1] == Y[j-1]) 
                L[i][j] = L[i-1][j-1] + 1; 
            else
                L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            System.out.println(L[i][j]);
          } 
          System.out.println("------------------------------------");
        } 
        return L[m][n]; 
    }
  
}
