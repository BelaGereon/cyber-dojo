package org.tasks.stringtransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowercaseTransformerTest {
    private final LowercaseTransformer lowercaseTransformer = new LowercaseTransformer();

    @Test
    void shouldReturnStringInAllLowercase() {
        // given
        String string = "LOREM IPSUM BLAH Blah blah...";

        // when
        String result = lowercaseTransformer.transform(string);

        // then
        assertEquals("lorem ipsum blah blah blah...", result);
    }

    @Test
    void shouldReturnEmptyString_whenStringIsEmpty() {
        // given
        String string = "";

        // when
        String result = lowercaseTransformer.transform(string);

        // then
        assertEquals("", result);
    }
}
