package pairmatching.constant;

import java.util.Arrays;
import java.util.stream.Collectors;

import static pairmatching.constant.ErrorMessage.MISSION_NOT_FOUND;
import static pairmatching.constant.Level.*;

public enum Mission {
    RACING_CAR(LEVEL1, "자동차경주"),
    LOTTO(LEVEL1, "로또"),
    BASEBALL(LEVEL1, "숫자야구게임"),

    BASKET(LEVEL2, "장바구니"),
    PAYMENT(LEVEL2, "결제"),
    SUBWAY(LEVEL2, "지하철노선도"),

    IMPROVE(LEVEL4, "성능개선"),
    DEPLOY(LEVEL4, "배포");

    private static final String PREFIX = "  - ";
    private static final String DELIMITER_LEVEL = ": ";
    private static final String DELIMITER_EACH = " | ";
    private final Level level;
    private final String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    private static String buildOptionsForLevel(Level level) {
        return Arrays.stream(values())
                .filter(v -> v.level == level)
                .map(Mission::toString)
                .collect(Collectors.joining(DELIMITER_EACH));
    }

    public static Mission fromLevelAndName(Level level, String name) {
        return Arrays.stream(values())
                .filter(v -> v.level == level && v.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MISSION_NOT_FOUND.toString()));
    }

    public static String buildOptionsOrderByLevel() {
        return Arrays.stream(Level.values())
                .map(l -> PREFIX + l + DELIMITER_LEVEL + buildOptionsForLevel(l))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String toString() {
        return name;
    }
}
