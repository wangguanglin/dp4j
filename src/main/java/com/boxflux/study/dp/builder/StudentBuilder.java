package com.boxflux.study.dp.builder;

/**
 * Created by wangguanglin on 2019/5/6.
 */
public class StudentBuilder {


    private Student target;

    public StudentBuilder() {
        target = new Student();
    }

    public StudentBuilder address(int id) {
        target.setId(id);
        return this;
    }

    public StudentBuilder name(String name) {
        target.setName(name);
        return this;
    }

    public StudentBuilder password(String passwd) {
        target.setName( passwd );
        return this;
    }

    public StudentBuilder sex(String sex) {
        target.setSex(sex);
        return this;
    }

    public StudentBuilder address(String address) {
        target.setAddress(address);
        return this;
    }

    public Student build() {
        return new Student(target);
    }
}
