import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeWeirdCharacters {

  private static final int TWO = 2;
  private static final int ZERO = 0;
  private static final String BLANK_REGEX = " ";
  private static final String SQUARE_REGEX = "";

  public String Solution(String s) {
    return Arrays.stream(s.split(BLANK_REGEX, -1)).map(this::toWeird).collect(Collectors.joining(BLANK_REGEX));
  }


  private String toWeird(String Characters) {
    if (Characters.equals(BLANK_REGEX)) {
      return Characters;
    }
    String[] tempArray = Characters.split(SQUARE_REGEX);
    for (int i = 0; i < tempArray.length; i++) {
      tempArray[i] = isEven(i) ? tempArray[i].toUpperCase() : tempArray[i].toLowerCase();
    }
    return String.join(SQUARE_REGEX, tempArray);
  }

  private boolean isEven(int index) {
    return index % TWO == ZERO;
  }

  public static void main(String[] args) {
    MakeWeirdCharacters makeWeirdCharacters = new MakeWeirdCharacters();
    System.out.println(makeWeirdCharacters.Solution("try    heldsadflo world"));

  }
}
