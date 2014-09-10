import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int count = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Insert number:");
	
		int total  = Integer.parseInt(br.readLine());
		
		for(int c1 = 0; c1 <= total; c1++)
		{
			for(int c2 = total - c1; c2 >= 0; c2--)
			{
				System.out.format("%d %d %d\n", c1, total - c1 - c2, c2);
				count++;
			}
		}
		
		System.out.format("Total combinations: %d", count);
	}

}