package OOPhw04WarGames.shields;

public class HandShield implements ForearmShield{
    @Override
    public int protect() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("HandShield, Protect: %d",protect());
    }
}