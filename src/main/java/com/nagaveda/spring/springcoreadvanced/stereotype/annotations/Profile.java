package com.nagaveda.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prof")
public class Profile {
    @Value("Senior Instructor")
    private String title;
    @Value("Veda Academy")
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Profile [company=" + company + ", title=" + title + "]";
    }

}
