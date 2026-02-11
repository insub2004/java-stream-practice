package problem.easy;

import java.util.List;

public class Problem1 {

    /**
     * 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 포함하는 리스트를 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 길이가 5 이상인 문자열만 포함하는 리스트
     */
    public static List<String> filterStrings(List<String> strings) {
        // 1. 생성
        // 2. 중간 연산 -> 길이가 5이상인 문자열 필터링
        // 3. 최종 연산 -> 스트림 데이터를 다시 리스트로 묶기
        return strings.stream()
                .filter(s -> s.length() >= 5)  // filter(Predicate) -> Predicate의 경우 boolean을 반환하는 추상 메서드가 있다.
                .toList();
    }
}
