package org.dan.cipher.demo;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class CellAddress {
    private final int row;
    private final int column;
}
