package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @Test
    public void doubleGWithinTheCenter() {
        Assertions.assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void doubleGAndSingleG() {
        Assertions.assertFalse(gHappy.gHappy("xxggyygxx"));
    }

    @Test
    public void singleGAndDoubleG() {
        Assertions.assertFalse(gHappy.gHappy("xxgyyggxx"));
    }


    @Test
    public void singleGInTheCenter() {
        Assertions.assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void singleG() {
        Assertions.assertFalse(gHappy.gHappy("g"));
    }

    @Test
    public void doubleG() {
        Assertions.assertTrue(gHappy.gHappy("gg"));
    }

    @Test
    public void tripleG() {
        Assertions.assertTrue(gHappy.gHappy("ggg"));
    }
}
