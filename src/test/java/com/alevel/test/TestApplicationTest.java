package com.alevel.test;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApplicationTest {

    String S = "abcdefgabc";
    String zigzag="PAYPALISHIRING";
    private static LongestSubstring longestSubstringInstance;
    private  static  ZigZagConversion zigZagInstance;
    @Before
    public void before(){
        System.out.println("Before runing...");
        longestSubstringInstance = new LongestSubstring();
        zigZagInstance = new ZigZagConversion();
    }
    @Test
    public void lenghtTest()
    {
        int lenght = longestSubstringInstance.lengthOfLongestSubstring(S);
        assertEquals(7,lenght);

    }
    @Test
    public  void zigZagTest()
    {
        String answer = zigZagInstance.convert(zigzag, 4);
        assertEquals("PINALSIGYAHRPI", answer);

    }

    }

