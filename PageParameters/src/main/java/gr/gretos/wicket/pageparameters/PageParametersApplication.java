package gr.gretos.wicket.pageparameters;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 */
public class PageParametersApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public PageParametersApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class getHomePage()
	{
		return PageParametersPage.class;
	}

}
