package com.test.galaxy;

import java.util.HashMap;
import java.util.Map;

/**
 *Test assignment --sanjay mishra
 *
 */
public class Dictionary
{
    public Map<String, RomanNumber> itsRomanNumerialsMap;

    public Map<String, Object> itsAssignedValueMap;
    
    private static Dictionary itsDictionary = new Dictionary();
    
    public static Dictionary getInstance()
    {
    	return itsDictionary;
    }

    private Dictionary()
    {
        itsRomanNumerialsMap = new HashMap<String, RomanNumber>();
        itsAssignedValueMap = new HashMap<String, Object>();
        loadRomanNumerials();
    }

    private void loadRomanNumerials()
    {
        RomanNumber[] romanNumerials = RomanNumber.values();
        for (RomanNumber romanNumerial : romanNumerials)
        {
            itsRomanNumerialsMap.put(romanNumerial.name(), romanNumerial);
        }
    }

    public void addAssignedValue(String theKey, Object theValue)
    {
        itsAssignedValueMap.put(theKey, theValue);
    }

    public Object getAssignedValue(String theKey)
    {
        return itsAssignedValueMap.get(theKey);
    }

    public RomanNumber getRomanNumerialValue(String theKey)
    {
        return itsRomanNumerialsMap.get(theKey);
    }
}
