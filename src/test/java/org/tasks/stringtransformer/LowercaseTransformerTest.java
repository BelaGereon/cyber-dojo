package org.tasks.stringtransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowercaseTransformerTest {
    @Test
    void shouldReturnStringInAllLowercase() {
        // given
        String string = "LOREM IPSUM BLAH Blah blah...";
        LowercaseTransformer lowercaseTransformer = new LowercaseTransformer();

        // when
        String result = lowercaseTransformer.transform(string);

        // then
        assertEquals("lorem ipsum blah blah blah...", result);
    }
}
