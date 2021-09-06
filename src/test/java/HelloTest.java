import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void case01(){
        // Arrange
        Hello hello = new Hello();
        // Act
        String actualResult = hello.sayHi("somkiat");
        // Assert
        Assert.assertEquals("Hello, somkiat", actualResult);

    }
}
