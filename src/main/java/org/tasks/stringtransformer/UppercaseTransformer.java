package org.tasks.stringtransformer;

public class UppercaseTransformer {
    public String transform(String string) {
        return string.isEmpty() ? "" : string.toUpperCase();
    }
}
