package com.salats.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by paradise on 19.04.16.
 */
@Entity
@Table(name = "call")
public class Call {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // in seconds
    private int duration;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
