package be.cegeka.bibliothouris.domain.users;

import org.apache.el.util.ReflectionUtil;
import org.springframework.test.util.ReflectionTestUtils;

public class UserTestBuilder {

    private String name;
    private int id;
    private String inss;
    private String city;

    public static UserTestBuilder aUser(){
        return new UserTestBuilder()
                .withName("Seppe")
                .withName("88032019507")
                .withCity("Hasselt");
    }

    public User build(){
        User user = new User(name, inss, city);
        ReflectionTestUtils.setField(user,"id", id);
        return user;
    }

    public UserTestBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public UserTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserTestBuilder withCity(String city) {
        this.city = city;
        return this;
    }

}
