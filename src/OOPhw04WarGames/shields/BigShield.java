package OOPhw04WarGames.shields;

public class BigShield implements FullShield{
    @Override
    public int protect() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("HandShield, Protect: %d",protect());
    }
}