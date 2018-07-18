package com.duyj.designpatterns.structure.adapter;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public interface IMessageService {

    /**
     * 处理信息头
     */
    void dealMessageHead();

    /**
     * 处理信息体
     */
    void dealMessageBody();
}
