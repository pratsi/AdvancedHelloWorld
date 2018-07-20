package IB2BS.Jenkins_SimpleJavaApplication;

import static org.junit.Assert.fail;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

//import org.junit.Test;

public class AdvancedHelloWorldTest {
	 @Test
	    public void testAdvancedHelloWorld() {
	        try {
	            new AdvancedHelloWorld();
	        } catch (Exception e) {
	            fail("Construction failed. ");
	        }
	    }

	    /**
	     * Test method for 
	     * {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld
	     *      #main(java.lang.String[])}.
	     */
	    @Test
	    public void testMain() {
	        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	        AdvancedHelloWorld.main(null);
	        assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
	        System.setOut(null);
	    }

	    /**
	     * Test method for 
	     * {@link com.getgnosis.tutorials.tutorial01001.AdvancedHelloWorld
	     *      #toString()}.
	     */
	    @Test
	    public void testToString() {
	        String helloWorldString =  new AdvancedHelloWorld().toString();
	        assertEquals("AdvancedHelloWorld [message=Hello World!]",helloWorldString);
	    }

}
