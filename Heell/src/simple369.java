import java.util.Scanner;

public class simple369 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter integer value 1~99 : "); // 문장 출력
			int i = scanner.nextInt(); // i에 입력받은 값을 저장
			if(((i/10)==3||(i/10)==6||(i/10)==9) && ((i%10)==3||(i%10)==6||(i%10)==9)) {
				System.out.println("박수짝짝");
				/* 십의 자리 숫자가 3, 6, 9이고 일의 자리 숫자가 3, 6, 9인 경우 박수짝짝 */
			}
			else if(((i/10)==3||(i/10)==6||(i/10)==9) || ((i%10)==3||(i%10)==6||(i%10)==9)) {
				System.out.println("박수짝");
				/* 십의 자리 숫자만 3, 6, 9이거나 일의 자리 숫자만 3, 6, 9인 경우 박수짝 */
				scanner.close();
			}

	}

}