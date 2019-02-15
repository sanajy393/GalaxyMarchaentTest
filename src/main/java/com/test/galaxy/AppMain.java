package com.test.galaxy;

/**
 Test assignment --sanjay mishra
 *
 */
public class AppMain
{
    public static void main(String[] args)
    {
        try
        {
            Process aConvertor = Process.getInstance();
            aConvertor.parseInput();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
