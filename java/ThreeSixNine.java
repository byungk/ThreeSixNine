
public class ThreeSixNine {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if(new String().valueOf(i).matches("[^369]*[369]+?[^369]*"))
				System.out.println("¦!");
			else
				System.out.println(i);
		}
	}
}
