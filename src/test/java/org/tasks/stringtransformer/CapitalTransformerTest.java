package org.tasks.stringtransformer;

import org.junit.jupiter.api.Test;
import org.tasks.stringtransformer.concretetransformers.CapitalTransformer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalTransformerTest {

    @Test
    void shouldReturnEmptyString_whenStringIsEmpty() {
        // given
        StringTransformer capitalTransformer = new StringTransformer();
        capitalTransformer.setTransformer(new CapitalTransformer());

        // when then
        assertEquals("", capitalTransformer.transform(""));
    }

    @Test
    void shouldReturnString_withAllFirstLettersAsCapitalLetters() {
        // given
        StringTransformer capitalTransformer = new StringTransformer();
        capitalTransformer.setTransformer(new CapitalTransformer());
        String string = "every first letter of each word should be upper case.";

        // when
        String result = capitalTransformer.transform(string);

        // then
        assertEquals("Every First Letter Of Each Word Should Be Upper Case.", result);
    }

}
