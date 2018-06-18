package YatzyGroup;

public class DicePlayChance implements IDicePlayWays {
    public int getYatzyResult(int[] rolls) {
        int result = 0;
        for (int i = 0; i < rolls.length; i++) {
            result += rolls[i];
        }
        return result;
    }
}
