package oop.assignment2.ex30;

public class ex30_solution {
    public static void main(String[] args) {
        ex30_solution app = new ex30_solution();
        int maxNumber = 12;
        app.createTable(maxNumber);
    }

    public void createTable(int maxNumber) {
        for(int i=1; i<=maxNumber; i++)
        {
            for(int j=1;j<=maxNumber; j++ ) {
                System.out.format("%4d", i*j);
            }
            System.out.print("\n");
        }
    }
}
