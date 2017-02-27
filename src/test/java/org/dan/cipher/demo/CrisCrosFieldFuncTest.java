package org.dan.cipher.demo;

import static org.dan.cipher.demo.CellState.X;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CrisCrosFieldFuncTest {
    @Test
    public void rowFalseOnEmpty() {
        assertFalse(CrisCrossField.builder().height(3).width(3).build().isVictory());               ;
    }

    @Test
    public void firstRowVictory() {
        assertTrue(CrisCrossField.builder().height(3).width(3).build()
                .set(CellAddress.builder().row(0).column(0).build(), X)
                .set(CellAddress.builder().row(0).column(1).build(), X)
                .set(CellAddress.builder().row(0).column(2).build(), X)
                .isVictory());
    }
}
