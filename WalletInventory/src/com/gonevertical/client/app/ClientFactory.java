package com.gonevertical.client.app;

import com.gonevertical.client.app.requestfactory.ApplicationRequestFactory;
import com.gonevertical.client.app.requestfactory.dto.UserDataProxy;
import com.gonevertical.client.views.signin.SignInPlace;
import com.gonevertical.client.views.walletedit.WalletEditPlace;
import com.gonevertical.client.views.walletlist.WalletListPlace;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.SimplePanel;


public interface ClientFactory {
  
	EventBus getEventBus();
	
	ApplicationRequestFactory getRequestFactory();
	
	PlaceController getPlaceController();

  void setUserData(UserDataProxy data);

  UserDataProxy getUserData();

  ActivityManager getActivityManager();
  
  Boolean getIsLoggedIn();
  
  void track();
  
  
  /**
   * used by the historyMapper
   */
  SignInPlace.Tokenizer getSignInTokenizer();
  /**
   * used by the historyMapper
   */
  WalletListPlace.Tokenizer getWalletListTokenizer();
  /**
   * used by the historyMapper
   */
  WalletEditPlace.Tokenizer getWalletEditTokenizer();
 
}
