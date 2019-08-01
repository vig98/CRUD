// @GENERATOR:play-routes-compiler
// @SOURCE:D:/latest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Aug 01 12:43:44 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversegetController getController = new controllers.ReversegetController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseupdateController updateController = new controllers.ReverseupdateController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversecreateController createController = new controllers.ReversecreateController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversedelController delController = new controllers.ReversedelController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversegetController getController = new controllers.javascript.ReversegetController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseupdateController updateController = new controllers.javascript.ReverseupdateController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversecreateController createController = new controllers.javascript.ReversecreateController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversedelController delController = new controllers.javascript.ReversedelController(RoutesPrefix.byNamePrefix());
  }

}
