package problem.easy;

import java.util.List;
import java.util.OptionalInt;

public class Problem4 {

    /**
     * 주어진 정수 리스트에서 최대값을 반환합니다.
     * 최소값을 찾는 것도 비슷한 방법으로 할 수 있습니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 리스트의 최대값
     */
    public static OptionalInt findMax(List<Integer> numbers) {

        // 중간 연산 : int 값으로 변환
        // 최종 연산 : 최댓값 찾기

        return numbers.stream()
                .mapToInt(Integer::intValue)
                .max();
    }
}