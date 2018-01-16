package com.capsella.vineguards.db.dto;

public class ResponseSignIn {

    String username;

    String name;

    String surname;

    String email;

    Long age;

    String grapeVariety;

    String grapeVarietyWikiLink;

    public ResponseSignIn() {
    }

    public ResponseSignIn(String username, String name, String surname, String email, Long age, String grapeVariety, String grapeVarietyWikiLink) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.grapeVariety = grapeVariety;
        this.grapeVarietyWikiLink = grapeVarietyWikiLink;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGrapeVariety() {
        return grapeVariety;
    }

    public void setGrapeVariety(String grapeVariety) {
        this.grapeVariety = grapeVariety;
    }

    public String getGrapeVarietyWikiLink() {
        return grapeVarietyWikiLink;
    }

    public void setGrapeVarietyWikiLink(String grapeVarietyWikiLink) {
        this.grapeVarietyWikiLink = grapeVarietyWikiLink;
    }
}
