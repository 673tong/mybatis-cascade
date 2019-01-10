package com.kisen.entity;


import javax.persistence.*;


/**
 * 采集任务bean
 */
@Table(name="task")
public class CollectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@KeySql(useGeneratedKeys = true) // 使用通用mapper插入数据库后返回主键
    private String 	id;//	id
    private String 	taskName;//	任务名称
    private String 	senderId;//	发布人id
    private String 	accepterId;//	接收人id
    private Integer 	isDelete=0;//	是否删除:0未删除，1已删除
    private User 	senderInfo;//	发布人信息
    private User 	accepterInfo;//	接收人信息

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getAccepterId() {
        return accepterId;
    }

    public void setAccepterId(String accepterId) {
        this.accepterId = accepterId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public User getSenderInfo() {
        return senderInfo;
    }

    public void setSenderInfo(User senderInfo) {
        this.senderInfo = senderInfo;
    }

    public User getAccepterInfo() {
        return accepterInfo;
    }

    public void setAccepterInfo(User accepterInfo) {
        this.accepterInfo = accepterInfo;
    }
}
