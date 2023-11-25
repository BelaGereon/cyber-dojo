package org.tasks.stringtransformer;

public class UppercaseTransformer extends BasicTransformer {

    @Override
    protected String sortingAlgorithm(String string) {
        return string.toUpperCase();
    }
}
