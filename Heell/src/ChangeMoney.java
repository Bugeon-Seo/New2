import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cash = new int[9]; // 지폐 동전별 필요한 수를 저장하는 배열 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input price(won): ");
		int price = scanner.nextInt(); // 금액을 입력하시오
		
		for (int i = 0; i < 9; i++) {
			cash[i] = price/unit[i]; // cash[i]에 50000원부터 필요한 수 저장
			price = price%unit[i]; // 50000원 후 남은 돈
			
			System.out.println(unit[i] + ": " + cash[i]);
			
		}

	}

}
