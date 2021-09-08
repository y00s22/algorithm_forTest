package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.StringTokenizer;

/**
 * A/B
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * https://www.acmicpc.net/problem/1008
 */
public class Question1008 {
    public static double division() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        // validation
        if (a <= 0 || b >= 10) {
            throw new InvalidParameterException();
        }

        return (a / b);
    }
}
