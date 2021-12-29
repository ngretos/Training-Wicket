package gr.gretos.wicket.simpleajax;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.PropertyModel;

import java.io.Serializable;
import java.util.*;

/**
 * Homepage
 */
public class SimpleAjaxPage extends WebPage
{

    private static final long serialVersionUID = 1L;

    private String               selectedCafe;
    private Address              address;
    private Map<String, Address> cafesAndAddresses = new HashMap<>();

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters Page parameters
     */
    public SimpleAjaxPage(final PageParameters parameters)
    {

        super(parameters);
        initCafes();

        ArrayList<String> cafeNames = new ArrayList<>(cafesAndAddresses.keySet());
        selectedCafe = cafeNames.get(0);
        address = new Address(cafesAndAddresses.get(selectedCafe).getAddress());

        final Label addressLabel =
                new Label("address", new PropertyModel(this.address, "address"));
        addressLabel.setOutputMarkupId(true);

        final DropDownChoice cafeDropdown =
                new DropDownChoice("cafes", new PropertyModel(this, "selectedCafe"), cafeNames);

        cafeDropdown.add(
                new AjaxFormComponentUpdatingBehavior("onchange")
                {
                    @Override
                    protected void onUpdate(AjaxRequestTarget ajaxRequestTarget)
                    {
                        String name = (String) cafeDropdown.getModelObject();
                        address.setAddress(cafesAndAddresses.get(name).getAddress());
                        ajaxRequestTarget.addComponent(addressLabel);
                    }
                }
                        );
        add(addressLabel);
        add(cafeDropdown);
    }

    private void initCafes()
    {
        this.cafesAndAddresses.put("Linda's Cafe", new Address("35 Bower St."));
        this.cafesAndAddresses.put("Old Tree", new Address("2 Edgware Rd."));
    }

    class Address implements Serializable
    {
        private String sAddress = "";

        public Address(String address)
        {
            this.sAddress = address;
        }

        public String getAddress()
        {
            return this.sAddress;
        }

        public void setAddress(String address)
        {
            this.sAddress = address;
        }
    }

}
