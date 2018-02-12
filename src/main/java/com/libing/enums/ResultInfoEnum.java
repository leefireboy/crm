package com.libing.enums;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/13 0:02
 */
public enum ResultInfoEnum {

    DISAGREE("更新记录与ID不一致！");

    private String info;

    ResultInfoEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
