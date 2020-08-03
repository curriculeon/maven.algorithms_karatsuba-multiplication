package com.github.curriculeon;

public class IntegerSplitter {
    private final String integerToBeAnalyzedAsString;
    private final int numberOfDigits;

    public IntegerSplitter(Integer integerToBeAnalyzed) {
        this.integerToBeAnalyzedAsString = integerToBeAnalyzed.toString();
        this.numberOfDigits = integerToBeAnalyzedAsString.length();
    }

    public Integer getQuarter(Integer quarter) {
        return Integer.valueOf(integerToBeAnalyzedAsString.substring((int) ((quarter-1) * .25), (int) (quarter * .25)));
    }
}
