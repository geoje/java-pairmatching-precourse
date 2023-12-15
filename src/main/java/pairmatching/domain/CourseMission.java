package pairmatching.domain;

import pairmatching.constant.Course;
import pairmatching.constant.Mission;

public record CourseMission(Course course, Mission mission) {
    public static CourseMission from(String choice) {
        return new CourseMission(Course.BACKEND, Mission.RACING_CAR);
        // TODO: Validate course, level, mission
    }
}
