package com.alevel.test;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) {
            return s;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            
            int j = 0;
            while (j + i < s.length()) {
                
                answer.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + numRows * 2 - 2 - i < s.length()) 
                    answer.append(s.charAt(j + numRows * 2 - 2 - i));
                j += numRows * 2 - 2;
                
            }
        }
        
        return answer.toString();
        
    }
}
