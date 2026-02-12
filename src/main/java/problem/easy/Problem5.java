package problem.easy;

import java.util.List;

public class Problem5 {

    /**
     * 주어진 문자열 리스트를 하나의 문자열로 연결하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 연결된 문자열
     */
    public static String concatenateStrings(List<String> strings) {

        // 중간 연산 : reduce 사용했던거 생각해서 초기값을 "" 주고 안에 있는걸 누적해서 합치는 식으로

        return strings.stream()
                .reduce("", String::concat);
    }
}