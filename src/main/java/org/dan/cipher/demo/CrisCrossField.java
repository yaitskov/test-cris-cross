package org.dan.cipher.demo;

import lombok.Builder;

import java.util.Map;

@Builder
public class CrisCrossField {
    private final Map<CellAddress, CellState> cellMap;
}
