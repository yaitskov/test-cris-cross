package org.dan.cipher.demo;

import lombok.Builder;

import java.util.Map;

@Builder
public class CrisCrossField {
    private final Map<CellAddress, CellState> cellMap;
    private final int width;
    private final int height;

    public CrisCrossField set(CellAddress address, CellState state) {
         if (cellMap.put(address, state) != null) {
             throw new IllegalStateException("cell " + address + " is used");
         }
         return this;
    }

    public boolean isVictory() {
        return isVictoryByRow();
    }

    private boolean isVictoryByRow() {
        CellState first = null;
        nextRow:
        for (int iRow = 0; iRow < width; ++iRow) {
            for (int iCol = 0; iCol < height; ++iCol) {
                CellState state = cellMap.get(CellAddress.builder()
                        .row(iRow).column(iCol).build());
                if (state == null) {
                    continue nextRow;
                } else if (first == null) {
                    first = state;
                } else if (first != state) {
                    continue nextRow;
                }
                return true;
            }
        }
        return false;
    }

}
