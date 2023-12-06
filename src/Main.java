import strings.zFunction.zFunction;

import java.util.ArrayList;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        zFunction zFunc = new zFunction();
        System.out.println(zFunc.getZFunctionArray(s));
    }

}