package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.StringTokenizer;

/**
 * 사칙연산
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 *
 * https://www.acmicpc.net/problem/10869
 */
public class Question10869 {
    public static void printAllArithmeticOperations() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        // validation
        if (a <= 0 || b > 10_000) {
            throw new InvalidParameterException();
        }

        System.out.println(addition(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(division(a, b));
        System.out.println(getRemainder(a, b));
    }

    private static int addition(int a, int b) {
        return (a + b);
    }

    private static int subtract(int a, int b) {
        return (a - b);
    }

    private static int multiply(int a, int b) {
        return (a * b);
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static int getRemainder(int a, int b) {
        return a % b;
    }
}
