package de.muellerbruehl.jsfdemo.converter;

import de.muellerbruehl.jsfdemo.Product;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
//https://github.com/muellermi
@FacesConverter(value = "ProductConverter")
public class ProductConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return Product.valueOf(value);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Product)value).name();
    }

}
