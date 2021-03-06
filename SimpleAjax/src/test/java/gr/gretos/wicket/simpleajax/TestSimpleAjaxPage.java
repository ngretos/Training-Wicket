package gr.gretos.wicket.simpleajax;

import gr.gretos.wicket.simpleajax.SimpleAjaxPage;
import junit.framework.TestCase;
import org.apache.wicket.util.tester.WicketTester;

/**
 * Simple test using the WicketTester
 */
public class TestSimpleAjaxPage extends TestCase
{
	private WicketTester tester;

	public void setUp()
	{
		tester = new WicketTester();
	}

	public void testRenderMyPage()
	{
		//start and render the test page
		tester.startPage(SimpleAjaxPage.class);

		//assert rendered page class
		tester.assertRenderedPage(SimpleAjaxPage.class);

		//assert rendered label component
		tester.assertLabel("label", "Simple Ajax App.");
	}
}
