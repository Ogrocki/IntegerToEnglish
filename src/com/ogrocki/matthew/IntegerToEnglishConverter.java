package com.ogrocki.matthew;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class IntegerToEnglishConverter {

    private final RuleBasedNumberFormat ruleBasedNumberFormat;

    public IntegerToEnglishConverter() {
        this.ruleBasedNumberFormat = new RuleBasedNumberFormat(Locale.CANADA, RuleBasedNumberFormat.SPELLOUT);;
    }

    public String convert(String number) throws NumberFormatException {
        return ruleBasedNumberFormat.format(Integer.parseInt(number));
    }
}
