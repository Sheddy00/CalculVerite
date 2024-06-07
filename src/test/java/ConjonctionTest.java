import hei.school.Affirmation;
import hei.school.Conjonction;
import hei.school.ConjonctionType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConjonctionTest {
    @Test
    public void testConjonctionEt() {
        Affirmation aff1 = new Affirmation("Lou est beau ", true);
        Affirmation aff2 = new Affirmation("Lou est pauvre", false);

        Conjonction conjonction = new Conjonction(ConjonctionType.DONC, aff1, aff2);
        assertFalse(conjonction.evaluation());
    }

    @Test
    public void testConjonctionOu() {
        Affirmation aff1 = new Affirmation("Lou est pauvre ", false);
        Affirmation aff2 = new Affirmation("Lou est beau", true);

        Conjonction conjonction = new Conjonction(ConjonctionType.OU, aff1, aff2);
        assertTrue(conjonction.evaluation());
    }

    @Test
    public void testConjonctionDonc() {
        Affirmation aff1 = new Affirmation("Lou est beau", true);
        Affirmation aff2 = new Affirmation("Lou est pauvre", false);

        Conjonction conjonction = new Conjonction(ConjonctionType.DONC, aff1,aff2);
        assertFalse(conjonction.evaluation());
    }

}
