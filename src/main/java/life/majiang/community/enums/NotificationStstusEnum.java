package life.majiang.community.enums;

public enum NotificationStstusEnum {

    //设置回复status的类型 0为未读 1为已读
    UNREAD(0),READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStstusEnum(int status) {
        this.status = status;
    }
}
