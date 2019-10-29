package com.alevel.test;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApplicationTest {

    String S = "abcdefgabc";
    private static LongestSubstring longestSubstringInstance;
    @Before
    public void before(){
        System.out.println("Before runing...");
        longestSubstringInstance = new LongestSubstring();
    }
    @Test
    public void lenghtTest()
    {
        int lenght = longestSubstringInstance.lengthOfLongestSubstring(S);
        assertEquals(7,lenght);

    }

    }

