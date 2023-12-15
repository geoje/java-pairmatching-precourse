package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.constant.GeneralMessage;

import static pairmatching.constant.GeneralMessage.REQUEST_COURSE_MISSION;
import static pairmatching.constant.GeneralMessage.REQUEST_MAIN_FUNC;

public class InputView {
    private static String readWithGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message.toString() + "%n", args);
        String result = Console.readLine().trim();
        System.out.println();
        return result;
    }

    public static String readMainFunc(String options) {
        return readWithGeneralMessage(REQUEST_MAIN_FUNC, options);
    }

    public static String readCourseMission() {
        return readWithGeneralMessage(REQUEST_COURSE_MISSION);
    }
}
