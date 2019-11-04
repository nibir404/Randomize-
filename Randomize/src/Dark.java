import java.util.Scanner;

public class Dark {
    public void entry(){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n-n+1; i++){
            if (n>10 && n!=0){
                System.out.println("you are under arrest");
                break;
            }
            else if (n<10 && n!=0){
                System.out.println("You are ready to play");
                break;
            }
            else System.out.println("Try Again");
        }
    }
}
