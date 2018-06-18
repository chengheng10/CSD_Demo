package YatzyGroup;

public class DicePlayThreeKind extends DicePlayDoubles implements IDicePlayWays {
    @Override
    public int getYatzyResult(int[] rolls) {
        super.setPairs(3);
        return super.getYatzyResult(rolls);
    }
}
