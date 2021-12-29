package gr.gretos.wicket.simpleajax;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 */
public class SimpleAjaxApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public SimpleAjaxApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class getHomePage()
	{
		return SimpleAjaxPage.class;
	}

}
