package com.pruge.product;

import lombok.Data;

import java.util.Date;

/**
 * @author purgeyao
 * @version : 1.0
 */
@Data
public class Message {

    /**
     * id
     */
    private Long id;

    /**
     * 消息
     */
    private String msg;

    /**
     * 时间戳
     */
    private Date sendTime;
}
