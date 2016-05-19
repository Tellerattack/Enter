package org.fireply.enter.model;
// Generated 2016-5-22 15:15:44 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Authorization generated by hbm2java
 */
public class Authorization implements java.io.Serializable {

    private String id;
    private User user;
    private String sequence;
    private String token;
    private Date lastTime;

    public Authorization() {
    }

    public Authorization(String id, User user, String sequence, String token, Date lastTime) {
        this.id = id;
        this.user = user;
        this.sequence = sequence;
        this.token = token;
        this.lastTime = lastTime;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSequence() {
        return this.sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLastTime() {
        return this.lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

}