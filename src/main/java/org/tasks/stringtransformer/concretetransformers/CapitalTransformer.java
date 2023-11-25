package org.tasks.stringtransformer.concretetransformers;

import org.tasks.stringtransformer.Transformer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalTransformer implements Transformer {
    @Override
    public String sort(String string) {
        return string.isEmpty() ? "" :
                Arrays.stream(
                string.split("\\s+"))
                        .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                        .collect(Collectors.joining(" "));
    }
}
