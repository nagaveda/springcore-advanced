package com.nagaveda.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
    @Value("#{T(java.lang.Math).abs(-40)}")
    private int id;
    @Value("#{new String('Nagaveda').toUpperCase()}")
    private String name;
    @Value("#{courses}")
    private List<String> courses;

    @Autowired
    @Qualifier("prof")
    private Profile profile;

    @Value("#{2+3 == 4}")
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor [active=" + active + ", courses=" + courses + ", id=" + id + ", name=" + name + ", profile="
                + profile + "]";
    }

}
