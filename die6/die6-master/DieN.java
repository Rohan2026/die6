
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class DieN
{
  /**
   * Contains the current value of the die
   */
  private int value;
  private int sidesInTheRoll;

  /**
   * Constructor to do an initial roll to set the first value
   */
  public DieN(int sides) {
    if (sides > 0) {
        sidesInTheRoll = sides;
    } else {
        System.out.print("No");
    }
    
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll(int N) {
    this.value = (int) (Math.random() * N) + 1;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    roll(sidesInTheRoll);
    return getValue();
  }

}