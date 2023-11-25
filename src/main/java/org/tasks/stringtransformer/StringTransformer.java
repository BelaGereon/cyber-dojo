package org.tasks.stringtransformer;

public class StringTransformer {
    private Transformer transformer;

    public String transform(String string) {
        return transformer.sort(string);
    }

    public void setTransformer(Transformer transformer) {
        this.transformer = transformer;
    }
}
