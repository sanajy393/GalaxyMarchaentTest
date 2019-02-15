package com.test.galaxy;

import java.util.List;
 
/**
 * 
 * Test assignment --sanjay mishra.
 */
public class ValueCon 
{
    public ValueCon()
    {
    }

    public double convertInputValues(String theInput) throws Exception
    {
		double itsResult = 0;

		IntergalacConversion anIntergalacticConversion = new IntergalacConversion();
		List<Object> aRomanValueList = anIntergalacticConversion.convertIntergalacticToRoman(theInput);
		
		if(aRomanValueList == null)
		{
			return itsResult;
		}
		
		RomanConversion aRomanConvertor = new RomanConversion();
		itsResult = aRomanConvertor.convertRomanNumerialToValue(aRomanValueList);
				
		return itsResult;
	}
}
