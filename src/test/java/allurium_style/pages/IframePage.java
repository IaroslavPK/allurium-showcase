package allurium_style.pages;

import dm.tools.annotations.Name;
import dm.tools.annotations.PageObject;
import dm.tools.annotations.Widget;
import dm.tools.inputs.TextField;
import dm.tools.primitives.Button;
import dm.tools.windows.Iframe;
import lombok.Getter;
import lombok.experimental.Accessors;

import static dm.tools.inputs.TextField.$textField;
import static dm.tools.primitives.Button.$button;

@PageObject
@Getter
@Accessors(fluent = true)
public class IframePage extends Page {

    @Name("Name")
    protected TextField fieldName = $textField("#name");

    @Name("Email")
    protected TextField fieldEmail = $textField("#email");

    @Name("Password")
    protected TextField fieldPassword = $textField("#password");

    @Name("Submit")
    protected Button btnSubmit = $button("#submit-main");

    @Name("Iframe Login Form")
    protected IframeLoginForm iframeLoginForm = new IframeLoginForm("#iframe_root");


    @Widget
    @Getter
    @Accessors(fluent = true)
    public static class IframeLoginForm extends Iframe {
        public IframeLoginForm(String selenideLocator) {
            super(selenideLocator);
        }

        @Name("Name")
        protected TextField fieldName = $textField("#name_iframe");

        @Name("Email")
        protected TextField fieldEmail = $textField("#email_iframe");

        @Name("Password")
        protected TextField fieldPassword = $textField("#password_iframe");

        @Name("Submit")
        protected Button btnSubmit = $button("#submit-iframe");
    }
}
