package gr.gretos.wicket.helloworld;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 *
 */
public class HelloWorldApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public HelloWorldApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class getHomePage()
	{
		return HelloWorldPage.class;
	}

}
