package com.gonevertical.client.app.events;

import com.google.gwt.event.shared.EventHandler;

public interface AuthEventHandler extends EventHandler {
  
  public void onAuthEvent(AuthEvent event);
  
}
