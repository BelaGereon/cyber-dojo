package org.tasks.stringtransformer.concretetransformers;

import org.tasks.stringtransformer.BasicTransformer;

public class UppercaseTransformer extends BasicTransformer {

    @Override
    protected String sortingAlgorithm(String string) {
        return string.toUpperCase();
    }
}
