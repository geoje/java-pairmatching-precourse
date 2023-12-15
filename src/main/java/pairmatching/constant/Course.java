package pairmatching.constant;

import java.util.Arrays;
import java.util.stream.Collectors;

import static pairmatching.constant.ErrorMessage.COURSE_NOT_FOUND;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private static final String DELIMITER = " | ";
    private final String name;

    Course(String name) {
        this.name = name;
    }

    public static Course fromName(String name) {
        return Arrays.stream(values())
                .filter(v -> v.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(COURSE_NOT_FOUND.toString()));
    }

    public static String buildOptions() {
        return Arrays.stream(values())
                .map(Course::toString)
                .collect(Collectors.joining(DELIMITER));
    }

    @Override
    public String toString() {
        return name;
    }
}
