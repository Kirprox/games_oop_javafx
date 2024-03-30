package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {
    @Test
    void position() {
        BishopBlack black = new BishopBlack(Cell.C8);
        assertThat(black.position()).isEqualTo(Cell.C8);
    }

    @Test
    void copy() {
        BishopBlack black = new BishopBlack(Cell.C8);
        assertThat(black.copy(Cell.D7).position()).isEqualTo(Cell.D7);
    }

    @Test
    void way() {
        BishopBlack black = new BishopBlack(Cell.C1);
        Cell[] result = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(black.way(Cell.G5)).isEqualTo(result);

    }

}