package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    /*
       问题不存在了
     */
    QUESTION_NOT_FOUND("你找的问题不存在了，要不要换一个试试？");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
