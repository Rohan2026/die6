
public class YahtzeeDice
{
    private Die6[] dice;
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    public YahtzeeDice()
    {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }
    
    public void roll()
    {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }  
    
    public void roll(int dieNumber)
    {
     if (dieNumber == 1)
     {
         die1.roll();
     }
     else if (dieNumber == 2)
     {
         die2.roll();
     }
     else if (dieNumber == 3)
     {
         die3.roll();
     }
     else if (dieNumber == 4)
     {
         die4.roll();
     }
     else if (dieNumber == 5)
     {
         die5.roll();
     }
    }
    
    public String summarize()
    {
        int[] counts = new int[6];  // Assuming six-sided dice

        // Count the occurrences of each dice value
        counts[die1.getValue() - 1]++;
        counts[die2.getValue() - 1]++;
        counts[die3.getValue() - 1]++;
        counts[die4.getValue() - 1]++;
        counts[die5.getValue() - 1]++;

        // Initialize an empty string for the summary
        String summary = "";

        // Build the summary string by concatenating information for each dice value
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 0) {
            // Concatenate the dice value, count, and a semicolon and space
            summary += (i + 1) + "-" + counts[i] + "; ";
            }
        }

        return summary; 
    }
    
    public String toString()
    {
        return "Dice Values:" + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
    }
}
