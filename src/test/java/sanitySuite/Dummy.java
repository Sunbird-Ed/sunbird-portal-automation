package sanitySuite;

import org.testng.annotations.Test;

public class Dummy {

    @Test(groups = "consumption")
    public void bookconsum()
    {
        System.out.println("book");
    }
    @Test(groups = "consumption")
    public void courseconsum()
    {
        System.out.println("book");
    }
    @Test(groups = "creation")
    public void bookCreation()
    {
        System.out.println("book");
    }
}
