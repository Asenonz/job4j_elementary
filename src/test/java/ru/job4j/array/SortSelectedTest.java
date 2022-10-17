package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {66, 22, 88, 11, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 11, 22, 66, 88};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {300, 100, 200};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {100, 200, 300};
        assertThat(result).containsExactly(expected);
    }
}
