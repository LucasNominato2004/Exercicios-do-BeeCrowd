import java.io.IOException;
import java.util.Scanner;

public class Sinuca{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] bolas = new int[N];
		int count = N;
		
		for(int i = 0; i < N; i++){
			bolas[i] = scanner.nextInt();
		}
		while(count != 1){
			for(int i = 0; i < count - 1; i++){
				if(bolas[i] == bolas[i + 1]) bolas[i] = 1;
				else bolas[i] = -1;
			}
			count--;
		}
		if(bolas[0] == -1) System.out.println("branca");
		else System.out.println("preta");
		scanner.close();
	}
}
