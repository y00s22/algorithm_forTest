package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.StringTokenizer;

/**
 * 나머지
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 *
 * https://www.acmicpc.net/problem/10430
 */
public class Question10430 {
    public static void checkRemainder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // validation
        if (A < 2 || A > 10_000
            || B < 2 || B > 10_000
            || C < 2 || C > 10_000) {
            throw new InvalidParameterException();
        }

        int firstQuestion = (A + B) % C;
        int firstCheck = ((A % C) + (B % C)) % C;

        int secondQuestion = (A * B) % C;
        int secondCheck = ((A % C) * (B % C)) % C;

        System.out.println(firstQuestion);
        System.out.println(firstCheck);
        System.out.println(secondQuestion);
        System.out.println(secondCheck);
    }
}
