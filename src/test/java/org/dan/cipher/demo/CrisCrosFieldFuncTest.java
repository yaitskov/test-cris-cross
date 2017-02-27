package org.dan.cipher.demo;

import static org.dan.cipher.demo.CellState.O;
import static org.dan.cipher.demo.CellState.X;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;

public class CrisCrosFieldFuncTest {
    @Test
    public void rowFalseOnEmpty() {
        assertFalse(newField().isVictory());               ;
    }

    @Test
    public void firstRowVictory() {
        assertTrue(newField()
                .set(address(0, 0), X)
                .set(address(0, 1), X)
                .set(address(0, 2), X)
                .isVictory());
    }

    @Test
    public void firstColumnVictory() {
        assertTrue(newField()
                .set(address(0, 0), X)
                .set(address(1, 0), X)
                .set(address(2, 0), X)
                .isVictory());
    }

    @Test
    public void topLeftBottomRightVictory() {
        assertTrue(newField()
                .set(address(0, 0), O)
                .set(address(1, 1), O)
                .set(address(2, 2), O)
                .isVictory());
    }

    @Test
    public void topLeftBottomRightNoVictory() {
        assertFalse(newField()
                .set(address(0, 0), O)
                .set(address(1, 1), X)
                .set(address(2, 2), O)
                .isVictory());
    }

    private CrisCrossField newField() {
        return CrisCrossField.builder().height(3).width(3)
                .cellMap(new HashMap<CellAddress, CellState>())
                .build();
    }

    private CellAddress address(int row, int column) {
        return CellAddress.builder().row(row).column(column)
                .build();
    }
}
