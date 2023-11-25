package org.tasks.stringtransformer.concretetransformers;

import org.tasks.stringtransformer.Transformer;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapitalTransformer implements Transformer {
    @Override
    public String sort(String string) {
        String spaceRegex = "\\s+";
        return string.isEmpty() ? "" :
                Arrays.stream(string.split(spaceRegex))
                        .map(capitalizeFirstLetters())
                        .collect(Collectors.joining(" "));
    }

    private static Function<String, String> capitalizeFirstLetters() {
        return str -> str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
