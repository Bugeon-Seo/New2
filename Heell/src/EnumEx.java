
public class EnumEx {
	public static void main(String[] args) {
		enum Week { 월, 화, 수, 목, 금, 토, 일 };

		for (Week day : Week.values())
			System.out.println(day + "요일 ");
		System.out.println();

		for (Week day : Week.values())
			System.out.println(day + "요일 has value " + day.ordinal());
		System.out.println();

		Week weekTest1 = Week.목;
		System.out.println(weekTest1);
		System.out.println();
	}

}
