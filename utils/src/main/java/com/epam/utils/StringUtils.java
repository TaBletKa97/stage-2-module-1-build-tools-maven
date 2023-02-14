package com.epam.utils;

import static org.apache.commons.lang3.compare.ComparableUtils.is;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return  is(str).greaterThan("0");
    }
}
