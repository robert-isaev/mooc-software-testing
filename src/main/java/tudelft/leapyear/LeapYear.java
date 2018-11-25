package tudelft.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {

        if(this.isDivisibleByFour(year) && this.isDivisibleByHundred(year) && this.isDivisibleByFourHundred((year))) {
            return true;

        } else if (this.isDivisibleByFour(year) && ! this.isDivisibleByHundred(year)) {
            return true;

        } else {
            return false;
        }
    }

    private boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }

    private boolean isDivisibleByHundred(int year) {
        return year % 100 == 0;
    }

    private boolean isDivisibleByFourHundred(int year) {
        return year % 400 == 0;
    }

}
