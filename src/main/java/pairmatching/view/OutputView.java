package pairmatching.view;

import pairmatching.constant.GeneralMessage;

import static pairmatching.constant.ErrorMessage.EXCEPTION_PREFIX;
import static pairmatching.constant.GeneralMessage.NOTIFY_COURSE;
import static pairmatching.constant.GeneralMessage.NOTIFY_RESULT;

public class OutputView {
    private static void printGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message + "%n", args);
    }

    public static void printErrorMessage(String message) {
        System.out.println(EXCEPTION_PREFIX + message);
    }

    public static void printCourse(String courses, String missions) {
        printGeneralMessage(NOTIFY_COURSE, courses, missions);
    }

    public static void printResult(String result) {
        printGeneralMessage(NOTIFY_RESULT, result);
    }
}
