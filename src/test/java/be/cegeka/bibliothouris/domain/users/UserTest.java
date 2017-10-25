package be.cegeka.bibliothouris.domain.users;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setup(){
        user = new User(10, "Seppe");
    }

    @Test
    public void equals_SameObject_IsTrue() throws Exception {
        assertThat(user).isEqualTo(user);
    }

    @Test
    public void equals_ObjectWithSameIdAndName_IsTrue() throws Exception {
        assertThat(user).isEqualTo(new User(10, "Seppe"));
    }

    @Test
    public void equals_NullObject_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(null);
    }

    @Test
    public void equals_OtherClass_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(new Object());
    }

    @Test
    public void equals_ObjectWithOtherId_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(new User(9, "Seppe"));
    }

    @Test
    public void equals_ObjectWithOtherName_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(new User(10, "Other"));
    }

    @Test
    public void equals_ObjectWithNullName_IsFalse() throws Exception {
        assertThat(user).isNotEqualTo(new User(10, null));
    }

    @Test
    public void equals_ObjectWithBothNullName_IsTrue() throws Exception {
        assertThat(new User(10, null)).isEqualTo(new User(10, null));
    }

    @Test
    public void equals_ObjectWithNoNullName_IsFalse() throws Exception {
        assertThat(new User(10, null)).isNotEqualTo(new User(10, "Seppe"));
    }

}