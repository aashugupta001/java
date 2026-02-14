import java.util.Scanner;
public class marks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter marks of 5 subjects");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();

        int total=m1+m2+m3+m4+m5;
        float percentage=(total/500.0f)*100;

        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+percentage+"%");

         if(percentage>=90){
            System.out.println("Grade: A");
        }
        else if(percentage>=80){
            System.out.println("Grade: B");
        }
        else if(percentage>=70){
            System.out.println("Grade: C");
        }
        else if(percentage>=60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

    }
}
