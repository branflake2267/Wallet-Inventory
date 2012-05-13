package com.gonevertical.client.widgets.ads;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;

public class Ad extends Composite {

  interface AdUiBinder extends UiBinder<Widget, Ad> {}
  private static AdUiBinder uiBinder = GWT.create(AdUiBinder.class);
  @UiField FlowPanel ad;

  public Ad() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void start() {
    RootPanel e = RootPanel.get("adsense");
    ad.add(e);
  }

}
