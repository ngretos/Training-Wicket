package gr.gretos.wicket.pageparameters;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class SubmissionPage extends WebPage
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters Page parameters
     */
    public SubmissionPage(final PageParameters parameters)
    {

        super(parameters);

        Label label = new Label("label", parameters.getString("msg"));


        add(label);
    }
}
