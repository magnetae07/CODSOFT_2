import java.util.Scanner;
public class studentGradeCalc{
	public static void main(String[] args) 
    {
        int avg,total=0,i;
        Scanner sc= new Scanner(System.in);
		System.out.print("No. of Subjects:");
        int n=sc.nextInt();
        int[] marks= new int[10];
        for(i=1;i<=n;i++){
		System.out.println("Enter your marks in subject"+i+":(out of 100)");
        marks[i]= sc.nextInt();
        if(marks[i]>100)
        {
            System.out.println("Invalid Entry of Marks");
            break;
        }
        total+=marks[i];
        }
        System.out.println("The Total Marks are:"+total);
        sc.close();
    
    avg=total/n;
         System.out.println("The Average Percentage is:"+avg+"%");
      
    switch((int)avg/10)
    {
    case 9:
    System.out.println("Your Grade is: A+");
    break;
    case 8:
    System.out.println("Your Grade is:A");
    break;
    case 7:
    System.out.println("Your Grade is:B");
    break;
    case 6:
    System.out.println("Your Grade is:C");
    break;
    case 5:
    System.out.println("Your Grade is:D");
    break;
    default:
    System.out.println("Your Grade is:F");
    break;
    }
}
}
