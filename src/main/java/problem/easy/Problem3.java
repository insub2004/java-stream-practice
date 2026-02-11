package problem.easy;

import java.util.List;

public class Problem3 {

    /**
     * 주어진 Double 리스트의 모든 요소의 합계를 반환합니다.
     *
     * @param numbers 원본 Double 리스트
     * @return 요소들의 합계
     */
    public static double sumOfList(List<Double> numbers) {
        // 방법 1번
        // 중간 연산 : DoubleStream 숫자 전용으로 변환 : mapToDouble(Double::doubleValue)를 사용
        // 최종 연산 : sum으로 모든 값 더하기
//        return numbers.stream()
//                .mapToDouble(Double::doubleValue)   // 메서드 참조 방식(n -> n.doubleValue()와 똑같음)
//                .sum();

        // 방법 2번
        //reduce(처음 시작하는 합계값, (지금까지 쌓인 합계, 리스트에서 새오 꺼낸 숫자) -> 지금까지 쌓인 합계 + 리스트에서 새오 꺼낸 숫자)
        return numbers.stream()
                .reduce(0.0, (a,b) -> a + b); // Double::sum 처럼 메서드 참조를 사용해도 좋음

    }
}