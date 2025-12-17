package com.example.demo.entity;

public class studententity{
    private int id;
    private String name;
    private String email;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(string name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public studententity(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}