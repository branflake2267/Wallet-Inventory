package com.gonevertical.client.app.activity;

import com.gonevertical.client.app.ClientFactory;
import com.gonevertical.client.views.signin.SignInActivity;
import com.gonevertical.client.views.signin.SignInPlace;
import com.gonevertical.client.views.walletedit.WalletEditActivity;
import com.gonevertical.client.views.walletedit.WalletEditPlace;
import com.gonevertical.client.views.walletlist.WalletListActivity;
import com.gonevertical.client.views.walletlist.WalletListPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class ApplicationActivityMapper implements ActivityMapper {
  
  private ClientFactory clientFactory;

  /**
   * AppActivityMapper associates each Place with its corresponding
   * {@link Activity}
   * 
   * @param clientFactory Factory to be passed to activities
   * @param walleteditview 
   * @param walletlistview 
   * @param signinview 
   */
  public ApplicationActivityMapper(ClientFactory clientFactory) {
    super();
    this.clientFactory = clientFactory;
  }
  
  /**
   * Map each Place to its corresponding Activity. 
   */
  @Override
  public Activity getActivity(Place place) {

    Activity activity = null;
    if (place instanceof SignInPlace) {
      activity = new SignInActivity((SignInPlace) place, clientFactory);
      
    } else if (place instanceof WalletListPlace) {
      activity = new WalletListActivity((WalletListPlace) place, clientFactory);
      
    } else if (place instanceof WalletEditPlace) {
      activity = new WalletEditActivity((WalletEditPlace) place, clientFactory);
      
    } 
    
    clientFactory.track();
    
    return activity;
  }

}
