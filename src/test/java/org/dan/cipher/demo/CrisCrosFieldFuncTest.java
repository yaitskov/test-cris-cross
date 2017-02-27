package org.dan.cipher.demo;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CrisCrosFieldFuncTest {
    @Test
    public void rowFalseOnEmpty() {
        assertFalse(CrisCrossField.builder().height(3).width(3).build().isVictory());               ;
    }
}
