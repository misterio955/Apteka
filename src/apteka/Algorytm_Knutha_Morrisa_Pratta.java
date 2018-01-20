/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.util.regex.Pattern;

/**
 *
 * @author Exatros
 */
public class Algorytm_Knutha_Morrisa_Pratta {

    private int m, n, i, j, t;
    private final int p[] = new int[100];

    public boolean akmp(String text, String pattern) {
        n = text.length();
        m = pattern.length();
        p[0] = 0;
        p[1] = 0;
        t = 0;

        for (j = 2; j <= m; j++) {
            while ((t > 0) && (pattern.charAt(t) != pattern.charAt(j - 1))) {
                t = p[t];
            }
            if (pattern.charAt(t) == pattern.charAt(j - 1)) {
                t++;
            }
            p[j] = t;
        }

        i = 1;
        j = 0;

        while (i <= n - m + 1) {
            j = p[j];
            while ((j < m) && (pattern.charAt(j) == text.charAt(i + j - 1))) {
                j++;
            }
            if (j == m) {
                return true;
            }
            i = i + Math.max(1, j - p[j]);
        }

        return false;
    }
}
