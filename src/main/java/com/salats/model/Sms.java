package com.salats.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by paradise on 19.04.16.
 */
@Entity
@Table(name = "sms")
public class Sms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int length;

    @Temporal(TemporalType.DATE)
    private Date sentAt;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
