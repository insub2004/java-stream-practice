package problem.easy;

import java.util.List;
import java.util.Optional;

public class Problem8 {

    /**
     * 주어진 정수 리스트에서 첫 번째로 짝수를 찾아 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 첫 번째 짝수 (존재하지 않으면 Optional.empty())
     */
    public static Optional<Integer> findFirstEven(List<Integer> numbers) {

        // "첫"번째 짝수를 찾을 것

        return numbers.stream()
                .filter(value -> value % 2 == 0)  // 2로 나눈 나머지가 0인 요소만 거르기
                .findFirst();                            // 그것들 중에 첫번째만 Optional 반환
    }
}