package noox.jetkins.beans;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Test unitario de la clase User
 */
public class UserTest {

    @Test
    public void testUserName() {

        String fakeName = "fakeName";

        User user = new User();
        user.setName(fakeName);

        Assert.assertEquals(fakeName, user.getName());
    }

}
