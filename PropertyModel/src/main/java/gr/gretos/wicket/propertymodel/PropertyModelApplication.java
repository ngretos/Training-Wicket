package gr.gretos.wicket.propertymodel;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 */
public class PropertyModelApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public PropertyModelApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class getHomePage()
	{
		return UserPage.class;
	}

}
