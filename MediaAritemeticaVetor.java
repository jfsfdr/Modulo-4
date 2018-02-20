package mediaaritemeticavetor;
import java.util.Scanner;
public class MediaAritemeticaVetor {
    public static void main(String[] args) {
        int n ,i;
        double med=0;
        Scanner dados=new Scanner(System.in);
        System.out.print("Quantos elementos tem a media");
        n=dados.nextInt();
        double []A=new double[n];
        for(i=0; i<=n-1;i++)
        {   System.out.print("Qual é o " + (i+1) + " Elemento ?");
            A[i]=dados.nextDouble();
        }
            for(i=0;i<=n-1;i++)
                med+=A[i];
            
            med=med/n;
        System.out.print(String.format("A Média é %5.2f",med));
    }
    
}
