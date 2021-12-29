package gr.gretos.wicket.propertymodel;

import junit.framework.TestCase;
import org.apache.wicket.util.tester.WicketTester;

/**
 * Simple test using the WicketTester
 */
public class TestPropertyModelPage extends TestCase
{
	private WicketTester tester;

	public void setUp()
	{
		tester = new WicketTester();
	}

	public void testRenderMyPage()
	{
		//start and render the test page
		tester.startPage(UserPage.class);

		//assert rendered page class
		tester.assertRenderedPage(UserPage.class);

		//assert rendered label component
		tester.assertLabel("label", "Simple Ajax App.");
	}
}
