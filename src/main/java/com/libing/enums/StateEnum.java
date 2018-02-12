package com.libing.enums;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/12 21:43
 */
public enum StateEnum {

    SUCCESS(1, "操作成功"),
    FAIL(0, "操作失败"),
    SYS_ERROR(-1, "系统异常");

    private int state;

    private String stateInfo;

    private StateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static StateEnum stateOf(int index) {
        for (StateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

}
