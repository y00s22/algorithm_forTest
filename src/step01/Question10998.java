package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.StringTokenizer;

/**
 * A×B
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * https://www.acmicpc.net/problem/10998
 */
public class Question10998 {
    public static int multiply() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        // validation
        if (a <= 0 || b >= 10) {
            throw new InvalidParameterException();
        }

        return (a * b);
    }
}
