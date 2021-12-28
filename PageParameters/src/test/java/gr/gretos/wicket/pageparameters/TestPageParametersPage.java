package gr.gretos.wicket.pageparameters;

import junit.framework.TestCase;
import org.apache.wicket.util.tester.WicketTester;

/**
 * Simple test using the WicketTester
 */
public class TestPageParametersPage extends TestCase
{
	private WicketTester tester;

	public void setUp()
	{
		tester = new WicketTester();
	}

	public void testRenderMyPage()
	{
		//start and render the test page
		tester.startPage(PageParametersPage.class);

		//assert rendered page class
		tester.assertRenderedPage(PageParametersPage.class);

		//assert rendered label component
		tester.assertLabel("label", "Simple Ajax App.");
	}
}
