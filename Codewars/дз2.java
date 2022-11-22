package Codewars;

public class дз2 {
    public static boolean isSquare(int r) {
        int n = (int) Math.sqrt(r);
        if (n*n==r)
            return true;
        else
            return false;
    }
}