package org.tasks.stringtransformer.concretetransformers;

import org.tasks.stringtransformer.BasicTransformer;

public class LowercaseTransformer extends BasicTransformer {

    @Override
    protected String sortingAlgorithm(String string) {
        return string.toLowerCase();
    }
}
