package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher cipher;
    private int alphabetLettersCount = 26;

    @BeforeEach
    public void initialize() {
        cipher = new CaesarShiftCipher();
    }

    @Test
    public void convertWithZeroShift() {
        Assertions.assertEquals("abc", cipher.encode("abc", 0));
    }

    @Test
    public void convertWithInvalidString() {
        Assertions.assertEquals("invalid", cipher.encode("23423", 0));
        Assertions.assertEquals("invalid", cipher.encode("ASG", 0));
        Assertions.assertEquals("invalid", cipher.encode("@#$@#", 0));
    }

    @Test
    public void convertWithPositiveShiftThatIsSmallerThenAlphabetLength() {
        Assertions.assertEquals("cde", cipher.encode("abc", 2));
    }

    @Test
    public void convertWithNegativeShiftThatIsSmallerThenAlphabetLength() {
        Assertions.assertEquals("abc", cipher.encode("def", -3));
    }

    @Test
    public void convertWithPositiveShiftEqualsToAlphabetLength() {
        Assertions.assertEquals("abc", cipher.encode("abc", alphabetLettersCount));
    }

    @Test
    public void convertWithNegativeShiftEqualsToAlphabetLength() {
        Assertions.assertEquals("abc", cipher.encode("abc", -1 * alphabetLettersCount));
    }

    @Test
    public void convertWithPositiveShiftThatIsBiggerByOneThenAlphabetLength() {
        Assertions.assertEquals("bcd", cipher.encode("abc", alphabetLettersCount + 1));
    }

    @Test
    public void convertWithNegativeShiftThatIsBiggerByOneThenAlphabetLength() {
        Assertions.assertEquals("zab", cipher.encode("abc", -1 * alphabetLettersCount - 1));
    }

    @Test
    public void convertWithPositiveShiftThatIsSmallerByOneThenAlphabetLength() {
        Assertions.assertEquals("zab", cipher.encode("abc", alphabetLettersCount - 1));
    }

    @Test
    public void convertWithNegativeShiftThatIsSmallerByOneThenAlphabetLength() {
        Assertions.assertEquals("bcd", cipher.encode("abc", -1 * alphabetLettersCount + 1));
    }
}
