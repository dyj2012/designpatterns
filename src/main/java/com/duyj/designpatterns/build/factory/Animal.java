package com.duyj.designpatterns.build.factory;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public interface Animal {

    /**
     * 动物名称
     *
     * @return
     */
    String getName();

    /**
     * 获取声音
     *
     * @return String
     */
    String getVoice();

    /**
     * 获取信息
     *
     * @return
     */
    default String getInfo() {
        return String.format("name:%s  voice:%s", this.getName(), this.getVoice());
    }

}
