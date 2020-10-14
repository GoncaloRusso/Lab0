package test;

import com.lab0.Group;
import com.lab0.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupTest {
    @Test
    public void testAddMember(){
        Person goncalo = new Person(1, "Goncalo");
        Person francisco = new Person(2, "Francisco");

        Group g1 = new Group(francisco);
        g1.addMember(goncalo);
        assertTrue (g1.hasMember(goncalo));

    }
}
