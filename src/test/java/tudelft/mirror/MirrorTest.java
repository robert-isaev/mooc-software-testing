package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void firstCase() {
        Mirror mr = new Mirror();
        Assertions.assertEquals("ab", mr.mirrorEnds("abXYZba"));
    }

    @Test
    public void secondCase() {
        Mirror mr = new Mirror();
        Assertions.assertEquals("a", mr.mirrorEnds("abca"));
    }

    @Test
    public void thirdCase() {
        Mirror mr = new Mirror();
        Assertions.assertEquals("a", mr.mirrorEnds("aba"));
    }
}
