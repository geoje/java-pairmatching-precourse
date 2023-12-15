package pairmatching.constant;

import java.util.Arrays;

import static pairmatching.constant.ErrorMessage.LEVEL_NOT_FOUND;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private final String name;

    Level(String name) {
        this.name = name;
    }

    public static Level fromName(String name) {
        return Arrays.stream(values())
                .filter(v -> v.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(LEVEL_NOT_FOUND.toString()));
    }

    @Override
    public String toString() {
        return name;
    }
}
