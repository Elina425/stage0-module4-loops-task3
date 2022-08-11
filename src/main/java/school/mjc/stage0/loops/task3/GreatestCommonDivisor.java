package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd =1;
        for(int i=0; i<=second && i<=first;i++){
            if(first%i==0 && second%i==0){
                gcd =i;//1-ic baci mi hatel unen u amenamecy ktpi
            }
            System.out.println(gcd);
        }
    }
}
