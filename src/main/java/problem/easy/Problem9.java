package problem.easy;

import java.util.List;
import java.util.stream.Collectors;

public class Problem9 {

    /**
     * 주어진 문자열 리스트의 각 문자열에 대해 길이가 3이상이면 대문자로 변환하고, 그렇지 않으면 그대로 두는 새로운 리스트를 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> transformStrings(List<String> strings) {
        // 틀렸던 점
        // 1. filter를 사용해 길이가 3이상인 문자열만 고르려고 했다 -> 3미만인 문자열들은 사라짐(문제의도는 그대로 두어야함!)
        // 정답
        // map(..) : 리스트의 각 요소를 하나씩 꺼내서 우리가 원하는 형태로 가공해야함 + 삼항연산다
        return strings.stream()
                .map(string -> string.length() >= 3 ? string.toUpperCase() : string)
                .collect(Collectors.toList());

    }
}