package com.codegears.programming.adapter;

/**
 * Created by pongwiiApp on 12/2/2559.
 */
public class NameMenu {
    String personName;
    String personAdd;
    String personDsg;
    boolean selected;
    public NameMenu(String name) {
        this.personName = name;
//        this.personAdd = add;
//        this.personDsg = dsg;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public String getPersonDsg() {
        return personDsg;
    }
    public void setPersonDsg(String personDsg) {
        this.personDsg = personDsg;
    }
    public String getPersonAdd() {
        return personAdd;
    }
    public void setPersonAdd(String personAdd) {
        this.personAdd = personAdd;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}