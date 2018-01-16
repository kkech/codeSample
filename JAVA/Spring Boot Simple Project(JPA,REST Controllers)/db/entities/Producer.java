package com.capsella.vineguards.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "producer")
public class Producer {

    @Id
    @GeneratedValue
    @Column(name="producer_id")
    private Long producerId;

    private String username;

    private String password;

    public Producer() {
    }

    public Producer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
