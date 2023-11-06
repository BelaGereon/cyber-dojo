package org.tasks.stringtransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UppercaseTransformerTest {

    @Test
    void shouldReturnEmptyString_whenGivenStringIsEmpty()  {
        // given
        String string = "";
        UppercaseTransformer uppercaseTransformer = new UppercaseTransformer();

        // when
        String result = uppercaseTransformer.transform(string);

        // then
        assertEquals("", result);
    }

    @Test
    void shouldReturnStringInAllUppercase() {
        // given
        String string = "Lorem Ipsum blah blah blah...";
        UppercaseTransformer uppercaseTransformer = new UppercaseTransformer();

        // when
        String result = uppercaseTransformer.transform(string);

        // then
        assertEquals("LOREM IPSUM BLAH BLAH BLAH...", result);
    }
}
