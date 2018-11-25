package tudelft.chocolate;

public class ChocolateBags {
    private static int kilosInSmallBar = 1;
    private static int kilosInBigBar = 5;

    public int calculate(int small, int big, int total) {

        if (total > packageFitInKilos(small, big)) {
            return -1;
        } else {
            return total % kilosInBigBar;
        }

    }

    private int packageFitInKilos(int small, int big) {
        return (small * kilosInSmallBar + big * kilosInBigBar);
    }

}
