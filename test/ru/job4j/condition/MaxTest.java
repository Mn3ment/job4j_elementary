package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int rsl = Max.max(1, 4);
        assertThat(rsl, is(4));
    }

    @Test
    public void testMax() {
        int rsl = Max.max(1, 4, 25);
        assertThat(rsl, is(25));
    }

    @Test
    public void testMax1() {
        int rsl = Max.max(6, 32, 1, 5);
        assertThat(rsl, is(32));
    }
}