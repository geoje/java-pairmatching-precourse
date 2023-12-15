package pairmatching.constant;

import java.util.Arrays;
import java.util.stream.Collectors;

import static pairmatching.constant.ErrorMessage.CHOICE_NOT_FOUND;

public enum YesOrNo {
    YES("네"),
    NO("아니오");

    private static final String DELIMITER = " | ";
    private final String name;

    YesOrNo(String name) {
        this.name = name;
    }

    public static YesOrNo fromName(String name) {
        return Arrays.stream(values())
                .filter(v -> v.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(CHOICE_NOT_FOUND.toString()));
    }

    public static String buildOptions() {
        return Arrays.stream(values())
                .map(YesOrNo::toString)
                .collect(Collectors.joining(DELIMITER));
    }

    @Override
    public String toString() {
        return name;
    }
}
