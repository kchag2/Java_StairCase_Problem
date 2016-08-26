import java.util.Scanner;

public class StairCaseProblem {
	public static int n;
	void stairCase(int n){
		for (int i=1;i<=n;i++)
		{
			for (int j = 1; j <=n; j++) {
				if((i+j)>n)
				{
				System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StairCaseProblem s=new StairCaseProblem();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of Rows:"); 
		n=in.nextInt();
		s.stairCase(n);
	}

}
