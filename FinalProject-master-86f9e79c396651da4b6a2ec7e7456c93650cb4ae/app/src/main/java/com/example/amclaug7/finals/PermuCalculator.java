package com.example.amclaug7.finals;

public class PermuCalculator {
    public static final String PREFERNECE_A = "A";
    public static final String PREFERNECE_R = "R";

    private int A;
    private int R;
    private int X;

    public PermuCalculator(){
        setA(0);
        setR(0);
        setX(0);
    }

    public void setA(int newA){
        if(newA > 0)
            A = newA;
    }

    public void setR(int newR){
        if(newR > 0)
            R = newR;
    }

    public void setX(int newX){
        if(newX > 0)
            X = newX;
    }

    public int getA(){
        return A;
    }

    public int getR(){
        return R;
    }

    public int getX(){
        return X;
    }

    public int factorial(int i){
        int k = 1;

        for(int j=1; j<=i; j++){
            k = j * k;
        }
        return k;
    }

    public double permutations(int i, int j, int k){
        double b;

        if(k == 0){
            b = (Math.pow(i, j));
        }
        else{
            b = (factorial(i)/factorial(i - j));
        }
        return Math.round(b);
    }

    public int permutations(){
        return (int)Math.round(permutations(A, R, X));
    }

    public String formatPermutations(){
        return Integer.toString(permutations());
    }
}
