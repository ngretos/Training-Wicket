package gr.gretos.wicket.helloworld;

import gr.gretos.wicket.helloworld.HelloWorldPage;
import junit.framework.TestCase;
import org.apache.wicket.util.tester.WicketTester;

/**
 * Simple test using the WicketTester
 */
public class TestHelloWorldPage extends TestCase
{
	private WicketTester tester;

	public void setUp()
	{
		tester = new WicketTester();
	}

	public void testRenderMyPage()
	{
		//start and render the test page
		tester.startPage(HelloWorldPage.class);

		//assert rendered page class
		tester.assertRenderedPage(HelloWorldPage.class);

		//assert rendered label component
		tester.assertLabel("label", "Hello World!");
	}
}
