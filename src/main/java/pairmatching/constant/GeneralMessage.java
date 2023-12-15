package pairmatching.constant;

public enum GeneralMessage {
    NOTIFY_COURSE("""
            #############################################
            과정: %s
            미션:
            %s
            ############################################"""),
    NOTIFY_RESULT("페어 매칭 결과입니다.\n%s"),

    REQUEST_MAIN_FUNC("기능을 선택하세요.\n%s"),
    REQUEST_COURSE("""
            과정, 레벨, 미션을 선택하세요.
            ex) 백엔드, 레벨1, 자동차경주""");

    private final String message;

    GeneralMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
