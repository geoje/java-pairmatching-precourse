package pairmatching.controller;

import pairmatching.constant.Course;
import pairmatching.constant.MainFunc;
import pairmatching.constant.Mission;
import pairmatching.domain.CourseMission;
import pairmatching.domain.History;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.function.Supplier;

public class MatchingController {
    public static void run() {
        History history = new History();
        while (true) {
            MainFunc mainFunc = requestMainFunc();
            if (mainFunc == MainFunc.QUIT) {
                return;
            }
            notifyCourse();
            notifyResult(history, requestCourseMission());
        }
    }

    private static <T> T requestUntilValidated(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private static void notifyCourse() {
        OutputView.printCourse(Course.buildOptions(), Mission.buildOptionsOrderByLevel());
    }

    private static void notifyResult(History history, CourseMission courseMission) {
        OutputView.printResult("");
    }

    private static MainFunc requestMainFunc() {
        String options = MainFunc.buildOptions();
        return requestUntilValidated(() -> MainFunc.fromKey(InputView.readMainFunc(options)));
    }

    private static CourseMission requestCourseMission() {
        return requestUntilValidated(() -> CourseMission.from(InputView.readCourseMission()));
    }
}
