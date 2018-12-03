package com.ogrocki.matthew;

import com.ibm.icu.text.RuleBasedNumberFormat;

public class IntegerToEnglishConverter {

    private final RuleBasedNumberFormat ruleBasedNumberFormat;

    public IntegerToEnglishConverter(RuleBasedNumberFormat ruleBasedNumberFormat) {
        this.ruleBasedNumberFormat = ruleBasedNumberFormat;
    }

    public String convert(String number) throws NumberFormatException {
        return ruleBasedNumberFormat.format(Integer.parseInt(number));
    }
}
