package pairmatching.constant;

public enum ErrorMessage {
    EXCEPTION_PREFIX("[ERROR] "),
    MAIN_FUNC_NOT_FOUND("존재하지 않는 기능입니다. 다시 입력해 주세요."),
    COURSE_NOT_FOUND("존재하지 않는 과정입니다. 다시 입력해 주세요."),
    LEVEL_NOT_FOUND("존재하지 않는 레벨입니다. 다시 입력해 주세요."),
    MISSION_NOT_FOUND("해당 레벨에 존재하지 않는 미션입니다. 다시 입력해 주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
