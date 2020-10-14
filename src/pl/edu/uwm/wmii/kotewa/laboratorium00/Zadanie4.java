package pl.edu.uwm.wmii.kotewa.laboratorium00;

public class Zadanie4 {
    public static void main(String[] args) {
                double SaldoKonta = 1000;
                for(int i=0; i<=2; i++) {
                    SaldoKonta = SaldoKonta + (SaldoKonta * 0.06);
                    System.out.println(SaldoKonta);


                }
            }
    }
