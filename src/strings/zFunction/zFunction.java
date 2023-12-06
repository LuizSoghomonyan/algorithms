package strings.zFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class zFunction {
    public ArrayList<Integer> getZFunctionArray(String str) {
        ArrayList<Integer> zFunc = new ArrayList<>(Collections.nCopies(str.length(), 0));
        int L = 0, R = 0;
        for (int i = 1; i < str.length(); i++) {
            if (i <= R) {
                zFunc.set(i, Math.min(R - i + 1, zFunc.get(i - L)));
            }

            while (i + zFunc.get(i) < str.length()
            && str.charAt(zFunc.get(i)) == str.charAt(i + zFunc.get(i))){
                zFunc.set(i, zFunc.get(i) + 1);
            }
            if (i + zFunc.get(i) - 1 > R) {
                R = i + zFunc.get(i) - 1;
                L = i;
            }



        }

        return zFunc;
    }
}
//aabcaabacaabc
