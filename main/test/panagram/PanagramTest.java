package panagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PanagramTest {
    @Test
    public void recognizesFullAlphabet() {
        String fullAlpha = "abcdefghijklmnopqrstuvwxyz";

        Assertions.assertTrue(Panagram.isPanagram(fullAlpha));
    }

    @Test
    public void rejectsPartial() {
        String partial = "abc";

        Assertions.assertFalse(Panagram.isPanagram(partial));
    }
}
