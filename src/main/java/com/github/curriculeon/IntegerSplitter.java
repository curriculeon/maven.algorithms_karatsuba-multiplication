package com.github.curriculeon;

public class IntegerSplitter {
    private final String integerToBeAnalyzedAsString;

    public IntegerSplitter(Integer integerToBeAnalyzed) {
        this.integerToBeAnalyzedAsString = integerToBeAnalyzed.toString();
    }

    public Integer getIntegerToBeAnalyzed() {
        return Integer.parseInt(integerToBeAnalyzedAsString);
    }

    public Integer getFirstQuarterOfDigits() {
        return Integer.valueOf(integerToBeAnalyzedAsString.substring(0, integerToBeAnalyzedAsString.length() / 4));
    }

    public Integer getSecondQuarterOfDigits() {
        return Integer.valueOf(integerToBeAnalyzedAsString.substring(integerToBeAnalyzedAsString.length() / 4, integerToBeAnalyzedAsString.length() / 2));
    }

    public Integer getThirdQuarterOfDigits() {
        return Integer.valueOf(integerToBeAnalyzedAsString.substring(integerToBeAnalyzedAsString.length() / 2, (3*integerToBeAnalyzedAsString.length()) / 4));
    }

    public Integer getFourthQuarterOfDigits() {
        return Integer.valueOf(integerToBeAnalyzedAsString.substring((3*integerToBeAnalyzedAsString.length()) / 4));
    }
}
