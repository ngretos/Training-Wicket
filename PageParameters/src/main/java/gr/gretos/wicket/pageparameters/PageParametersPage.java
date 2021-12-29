package gr.gretos.wicket.pageparameters;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

import java.io.Serializable;
import java.util.*;

/**
 * Homepage
 */
public class PageParametersPage extends WebPage
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters Page parameters
     */
    public PageParametersPage(final PageParameters parameters)
    {

        super(parameters);

        Form form =
                new Form("myform")
                {
                    @Override
                    protected void onSubmit()
                    {
                        PageParameters pageParameters = new PageParameters();
                        pageParameters.add("msg", "This is my parameter value.");
                        setResponsePage(SubmissionPage.class, pageParameters);
                    }
                };

        Button button = new Button("submit");

        form.add(button);

        add(form);
    }

}
