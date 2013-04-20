package au.com.ojitha.blogspot.spring3.part7;

import au.com.ojitha.blogspot.spring3.part7.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
