package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum =0;
        double tot =0;
        for( int i=1; i<lengthOfLastNumber;i++){
            double power =Math.pow(10, i);
            tot= power-1;
            sum+=tot;

        }
        System.out.println(sum);
    }
}
