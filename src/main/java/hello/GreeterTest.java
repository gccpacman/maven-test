package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class GreeterTest {
    pricate Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}