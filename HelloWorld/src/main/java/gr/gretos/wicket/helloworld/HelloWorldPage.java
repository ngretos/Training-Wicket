package gr.gretos.wicket.helloworld;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

/**
 * Homepage
 */
public class HelloWorldPage extends WebPage {

	private static final long serialVersionUID = 1L;

    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HelloWorldPage(final PageParameters parameters) {

        // Add the simplest type of label

		Form myForm = new Form("form", initModel());

		add(myForm);
		myForm.add(new Label("label", "Hello World!"));
		myForm.add(new Button ("button", initModel()));

    }
}
