package pairmatching.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static pairmatching.constant.ErrorMessage.MISSION_NOT_FOUND;

public enum Mission {
    RACING_CAR(Level.LEVEL1, "자동차경주");

    private static final String PREFIX = "  - ";
    private static final String DELIMITER_LEVEL = ": ";
    private static final String DELIMITER_EACH = " | ";
    private final Level level;
    private final String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    public static Mission fromLevelAndName(Level level, String name) {
        return Arrays.stream(values())
                .filter(v -> v.level == level && v.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MISSION_NOT_FOUND.toString()));
    }

    public static String buildOptionsOrderByLevel() {
        Map<Level, String> missionsByLevel = new HashMap<>();
        for (Mission v : values()) {
            if (missionsByLevel.containsKey(v.level)) {
                String name = missionsByLevel.get(v.level);
                missionsByLevel.put(v.level, name + DELIMITER_EACH + v.name);
                continue;
            }
            missionsByLevel.put(v.level, v.name);
        }

        return Arrays.stream(Level.values())
                .map(l -> PREFIX +
                        l.name() +
                        DELIMITER_LEVEL +
                        missionsByLevel.get(l))
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
