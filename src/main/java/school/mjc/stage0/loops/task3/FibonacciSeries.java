package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm=0, secondTerm =1;
        System.out.println(firstTerm);
        for(int i =1; i<=lastFibonacci;i++){

            int nextTerm = firstTerm+ secondTerm;
            firstTerm =secondTerm;
            secondTerm = nextTerm;
            System.out.println(nextTerm);
        }
    }
}
