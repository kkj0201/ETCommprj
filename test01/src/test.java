import java.io.IOException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException, InterruptedException {
		final int size = 10;
		int[][] seats = new int[size][size];
		 
		while(true) {
		
			System.out.println("-------------------");
			int full_size = size*size;
			for(int i = 0;i<full_size;i++)
			{
				if((i%10)==0)
				{
					System.out.println();
				}
				System.out.print(i+1+" ");				
			}
			System.out.println("\n-----------------------");
			for(int i = 0;i<size;i++)
			{
				for(int j = 0;j<size;j++)
				{
					System.out.print(seats[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("\n-----------------------");
			
			System.out.print("원하는 좌석번호를 입력하세요(종료는 -1)");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			int x = s-1;
			
			if(s == -1)
			{
				break;
			}
			if(seats[x/10][(x%10)]==0)
			{
				seats[x/10][(x%10)]=1;
				System.out.println("예약되었습니다");
			} else {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
		

	}
}
