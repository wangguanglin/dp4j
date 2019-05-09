package com.boxflux.study.dp.builder;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class Student {

    private int id;
    private String name;
    private String passwd;
    private String sex;
    private String address;

    // 构造器尽量缩小范围
    public Student() {
    }

    // 构造器尽量缩小范围
    public Student(Student origin) {
        // 拷贝一份
        this.id = origin.id;
        this.name = origin.name;
        this.passwd = origin.passwd;
        this.sex = origin.sex;
        this.address = origin.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}