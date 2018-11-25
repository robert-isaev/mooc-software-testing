package tudelft.chocolate;

public class ChocolateBags {
    private static int kilosInSmallBar = 1;
    private static int kilosInBigBar = 5;

    public int calculateSmallBars(int small, int big, int total) {

        if (! willPackageFit(small, big, total)) {
            return -1;
        } else {
            return total % kilosInBigBar;
        }

    }

    private boolean willPackageFit(int small, int big, int total) {

        if (total % kilosInBigBar > small) {
            return false;

        } else if (total < kilosInBigBar) {
            return total <= small;

        } else {
            return total <= ((small * kilosInSmallBar) + (big * kilosInBigBar));
        }

    }

}
