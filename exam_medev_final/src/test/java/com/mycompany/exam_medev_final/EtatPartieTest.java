package com.mycompany.exam_medev_final;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EtatPartieTest {

    @Test
    public void testEnumValues() {
        EtatPartie[] vals = EtatPartie.values();
        assertArrayEquals(new EtatPartie[]{EtatPartie.EN_COURS, EtatPartie.GAGNEE, EtatPartie.PERDUE}, vals);
    }

    @Test
    public void testUsageInLogic() {
        EtatPartie e = EtatPartie.EN_COURS;
        assertEquals(EtatPartie.EN_COURS, e);
        e = EtatPartie.GAGNEE;
        assertTrue(e == EtatPartie.GAGNEE);
    }
}
