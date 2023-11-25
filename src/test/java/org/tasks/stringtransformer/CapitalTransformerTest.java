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

        assertEquals("", capitalTransformer.transform(""));
    }



}
