import java.util.regex.Pattern;

public class patterndemo1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//if the regex matches with the input pattern u will get true
			System.out.println(Pattern.matches("simplilearn", "simplilearn"));
			System.out.println(Pattern.matches("simplilearn", "simpli"));
		}

	}
