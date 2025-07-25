import java.util.Scanner;

public class task1s3 {
    public static void  main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] scores ={85,92,78,96,88};
        int max = 0 ;
        int sum =0 ;

        for(int i=0 ; i < scores.length ; i++){
            sum+=scores[i];
            if(scores[i]>max){
                max=scores[i] ;
            }
        }

        double average = (double) sum / scores.length ;
        System.out.println( "The maximum value = " + max );
        System.out.println("The sum = " + sum);
        System.out.println("The average = " + average );
        System.out.println("Enter index numper : ");
        int z = cin.nextInt();
        if(z>=0&&z<scores.length){
            System.out.println( "the chosen value = " + scores[z]);
        }
        else {
            System.out.println("Value not found .");
        }
    }
}
