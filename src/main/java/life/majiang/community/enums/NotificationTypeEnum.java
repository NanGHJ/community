package life.majiang.community.enums;

public enum NotificationTypeEnum {

    //设置回复type的类型
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(1,"回复了问题")
    ;
    private int type;
    private String name;

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }
}
