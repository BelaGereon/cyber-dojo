package org.tasks.stringtransformer;

public class LowercaseTransformer extends BasicTransformer {

    @Override
    protected String sortingAlgorithm(String string) {
        return string.toLowerCase();
    }
}
