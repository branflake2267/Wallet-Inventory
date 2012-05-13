package com.gonevertical.client.widgets.logo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;

public class Logo extends Composite {

  interface LogoUiBinder extends UiBinder<Widget, Logo> {}
  private static LogoUiBinder uiBinder = GWT.create(LogoUiBinder.class);
  @UiField HTML htmlLogo;

  public Logo() {
    initWidget(uiBinder.createAndBindUi(this));
    
    htmlLogo.addStyleName("logoHtml");
  }

}
