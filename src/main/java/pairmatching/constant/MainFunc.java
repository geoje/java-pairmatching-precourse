package pairmatching.constant;

import java.util.Arrays;
import java.util.stream.Collectors;

import static pairmatching.constant.ErrorMessage.MAIN_FUNC_NOT_FOUND;

public enum MainFunc {
    MATCH_PAIR("1", "페어 매칭"),
    VIEW_PAIR("2", "페어 조회"),
    RESET_PAIR("3", "페어 초기화"),
    QUIT("Q", "종료");

    private final String key;
    private final String name;

    MainFunc(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public static MainFunc fromKey(String key) {
        return Arrays.stream(values())
                .filter(v -> v.key.equals(key))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MAIN_FUNC_NOT_FOUND.toString()));
    }

    public static String buildOptions() {
        return Arrays.stream(values())
                .map(MainFunc::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String toString() {
        return key + ". " + name;
    }
}
