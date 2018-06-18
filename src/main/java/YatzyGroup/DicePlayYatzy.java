package YatzyGroup;

public class DicePlayYatzy implements IDicePlayWays {
    public int getYatzyResult(int[] rolls) {
        int result = 0;
        boolean isYatzy = true;
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[0] != rolls[i]) isYatzy = false;
        }
        if (isYatzy) result = 50;
        return result;
    }
}
