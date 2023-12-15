package pairmatching.domain;

import pairmatching.constant.Course;
import pairmatching.constant.Level;
import pairmatching.constant.Mission;

import static pairmatching.constant.ErrorMessage.TOO_FEW_ARGUMENT;

public record CourseMission(Course course, Mission mission) {
    private static final String DELIMITER = ",";

    private static void validateEnough(String choice) {
        if (choice.split(DELIMITER).length < 3) {
            throw new IllegalArgumentException(TOO_FEW_ARGUMENT.toString());
        }
    }

    public static CourseMission from(String choice) {
        validateEnough(choice);
        String[] splitted = choice.split(DELIMITER);

        return new CourseMission(
                Course.fromName(splitted[0]),
                Mission.fromLevelAndName(Level.fromName(splitted[1]), splitted[2]));
    }
}
