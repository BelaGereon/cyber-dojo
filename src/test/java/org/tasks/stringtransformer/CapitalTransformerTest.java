package org.tasks.stringtransformer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tasks.stringtransformer.concretetransformers.CapitalTransformer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalTransformerTest {
    StringTransformer capitalTransformer = new StringTransformer();

    @BeforeEach
    void setup() {
        capitalTransformer.setTransformer(new CapitalTransformer());
    }

    @Test
    void shouldReturnEmptyString_whenStringIsEmpty() {
        // when then
        assertEquals("", capitalTransformer.transform(""));
    }

    @Test
    void shouldReturnString_withAllFirstLettersAsCapitalLetters() {
        // given
        String string = "every first letter of each word should be upper case.";

        // when
        String result = capitalTransformer.transform(string);

        // then
        assertEquals("Every First Letter Of Each Word Should Be Upper Case.", result);
    }
}
