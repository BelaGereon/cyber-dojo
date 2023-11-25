package org.tasks.stringtransformer;

public abstract class BasicTransformer implements Transformer {
    @Override
    public String sort(String string) {
        return sortingAlgorithm(string);
    }

    protected abstract String sortingAlgorithm(String string);
}
