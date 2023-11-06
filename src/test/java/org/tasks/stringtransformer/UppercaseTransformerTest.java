package org.tasks.stringtransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseTransformerTest {
     private final UppercaseTransformer uppercaseTransformer = new UppercaseTransformer();

    @Test
    void shouldReturnEmptyString_whenGivenStringIsEmpty()  {
        // given
        String string = "";

        // when
        String result = uppercaseTransformer.transform(string);

        // then
        assertEquals("", result);
    }

    @Test
    void shouldReturnStringInAllUppercase() {
        // given
        String string = "Lorem Ipsum blah blah blah...";

        // when
        String result = uppercaseTransformer.transform(string);

        // then
        assertEquals("LOREM IPSUM BLAH BLAH BLAH...", result);
    }
}
