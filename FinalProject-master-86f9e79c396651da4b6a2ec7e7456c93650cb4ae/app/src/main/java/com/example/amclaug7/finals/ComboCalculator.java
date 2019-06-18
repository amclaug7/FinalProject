package com.example.amclaug7.finals;

public class ComboCalculator {
    private int N;
    private int K;

    public ComboCalculator(){
        setN(0);
        setK(0);
    }

    public void setN(int newN){
        if(newN > 0)
            N = newN;
    }

    public void setK(int newK){
        if(newK > 0)
            K = newK;
    }

    public int getN(){
        return N;
    }

    public int getK(){
        return K;
    }

    public int factorial(int i){
        int k = 1;

        for(int j=1; j<=i; j++){
            k = j * k;
        }
        return k;
    }

    public int factorialSimpler(int i, int j){
        int l = 1;

        for(int k = (i - j + 1); k<=i; k++){
            l = k * l;
        }
        return l;
    }

    public int combinations(){
        return (factorialSimpler(N,K)/ (factorial(K)));
    }

    public String formatCombinations(){
        return Integer.toString(combinations());
    }
}