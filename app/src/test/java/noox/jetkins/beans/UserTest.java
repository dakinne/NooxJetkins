package noox.jetkins.beans;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Test unitario de la clase User
 */
public class UserTest {

    @Test
    public void testFirstname() {

        String fakeFirstname = "fakeFirstname";

        User user = new User();
        user.setFirstname(fakeFirstname);

        Assert.assertEquals(fakeFirstname, user.getFirstname());
    }

    @Test
    public void testLastname() {

        String fakeLastname = "fakeLastname";

        User user = new User();
        user.setLastname(fakeLastname);

        Assert.assertEquals(fakeLastname, user.getLastname());
    }

    @Test
    public void testNullsByDefault() {

        User user = new User();

        Assert.assertEquals(null, user.getFirstname());
        Assert.assertEquals(null, user.getLastname());
    }
}
