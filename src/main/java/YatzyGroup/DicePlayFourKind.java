package YatzyGroup;

public class DicePlayFourKind extends DicePlayDoubles implements IDicePlayWays {
    @Override
    public int getYatzyResult(int[] rolls) {
        super.setPairs(4);
        return super.getYatzyResult(rolls);
    }
}
