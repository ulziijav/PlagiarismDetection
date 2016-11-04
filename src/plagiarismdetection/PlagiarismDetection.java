/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plagiarismdetection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Gamer
 */
public class PlagiarismDetection {

    /**
     * @param args the command line arguments
     */
    private static final String EMPTY_STRING = "";
    private static final int ZERO = 0;

    public static void main(String[] args) {

        String[] aa = {"hello", "world,", "so", "how", "you","doin."};
            
        String[] bb = {"how", "hello"};
        String a = "hwstyd";
        String b = "th";

        String result = EMPTY_STRING;
        String result1 = EMPTY_STRING;

   
        result = calcLCS(a, b);

        System.out.println(result);

        result1 = eachWordLCS(aa, bb);

        System.out.println(result1);
    }

    public static String calcLCS(String sourceStr, String testStr) {

        int sLen = sourceStr.length();
        int tLen = testStr.length();

        if (sLen == ZERO || tLen == ZERO) {
            return EMPTY_STRING;
        } else {
            if (sourceStr.charAt(sLen - 1) == testStr.charAt(tLen - 1)) {
                return calcLCS(sourceStr.substring(ZERO, sLen - 1), testStr.substring(ZERO, tLen - 1))
                        + sourceStr.charAt(sLen - 1);
            } else {
                String x = calcLCS(sourceStr, testStr.substring(ZERO, tLen - 1));
                String y = calcLCS(sourceStr.substring(ZERO, sLen - 1), testStr);
                return (x.length() > y.length()) ? x : y;
            }
        }
    }

    public static String eachWordLCS(String[] sourceStr, String[] testStr) {
        
        int sLen = sourceStr.length;
        int tLen = testStr.length;

        if (sLen == ZERO || tLen == ZERO) {
            return EMPTY_STRING;
        } else {
            if (sourceStr[sLen - 1].toUpperCase().equals(testStr[tLen - 1].toUpperCase())) {
                return eachWordLCS(Arrays.copyOfRange(sourceStr, ZERO, sLen - 1), Arrays.copyOfRange(testStr, ZERO, tLen - 1))
                        + sourceStr[sLen - 1] + " ";
            } else {
                String x = eachWordLCS(sourceStr, Arrays.copyOfRange(testStr, ZERO, tLen - 1));
                String y = eachWordLCS(Arrays.copyOfRange(sourceStr, ZERO, sLen - 1), testStr);
                return (x.length() > y.length()) ? x : y;
            }
        }
    }

}
