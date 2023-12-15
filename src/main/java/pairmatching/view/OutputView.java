package pairmatching.view;

import pairmatching.constant.GeneralMessage;

import static pairmatching.constant.ErrorMessage.EXCEPTION_PREFIX;
import static pairmatching.constant.GeneralMessage.NOTIFY_COURSE;

public class OutputView {
    private static void printGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message + "%n", args);
    }

    public static void printErrorMessage(String message) {
        System.out.println(EXCEPTION_PREFIX + message);
    }

    public static void printCourse() {
        printGeneralMessage(NOTIFY_COURSE);
    }
}
