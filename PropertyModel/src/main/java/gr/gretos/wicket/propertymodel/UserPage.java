package gr.gretos.wicket.propertymodel;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;

/**
 * Homepage
 */
public class UserPage extends WebPage
{

    private static final long serialVersionUID = 1L;

    private User user = new User();
    private String nickname;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters Page parameters
     */
    public UserPage(final PageParameters parameters)
    {
        add(new FeedbackPanel("feedback"));

        final TextField tName = new TextField("name", new PropertyModel(user, "name"));
        final TextField tage = new TextField("age", new PropertyModel(user, "age"));
        final TextField tnickname = new TextField("nickname", new PropertyModel(this, "nickname"));

        Form form = new Form("userForm")
        {
            @Override
            protected void onSubmit()
            {
                PageParameters pageParameters = new PageParameters();
                pageParameters.add("name", user.getName());
                pageParameters.add("age", String.valueOf(user.getAge()));
                pageParameters.add("nickname", nickname);

                setResponsePage(SubmissionPage.class, pageParameters);
            }
        };

        add(form);
        form.add(tName);
        form.add(tage);
        form.add(tnickname);
    }

}
