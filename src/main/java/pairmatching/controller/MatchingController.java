package pairmatching.controller;

import pairmatching.constant.MainFunc;
import pairmatching.domain.CourseMission;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.function.Supplier;

public class MatchingController {
    public static void run() {
        while (true) {
            MainFunc mainFunc = requestMainFunc();
            if (mainFunc == MainFunc.QUIT) {
                return;
            }
            notifyCourse();
            CourseMission courseMission = requestCourseMission();
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
        OutputView.printCourse();
    }

    private static MainFunc requestMainFunc() {
        String options = MainFunc.buildOptions();
        return requestUntilValidated(() -> MainFunc.fromKey(InputView.readMainFunc(options)));
    }

    private static CourseMission requestCourseMission() {
        return requestUntilValidated(() -> CourseMission.from(InputView.readCourseMission()));
    }
}
