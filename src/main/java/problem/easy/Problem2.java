package problem.easy;

import java.util.List;
import java.util.Objects;

public class Problem2 {

    /**
     * 주어진 정수 리스트의 각 요소를 제곱하여 새로운 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 각 요소를 제곱한 새 리스트
     */
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        // 1. 생성
        // 2. 중간 연산 -> 각 요소를 제곱 == 변환 -> map
        // 3. 최종 연산
        return numbers.stream()
                .map(n -> n*n) // map은 지나가는 데이터를 하나하나 다른 값으로 변신 시켜주는 역할, 요소를 1:1로 변환함
                .toList();
    }
}