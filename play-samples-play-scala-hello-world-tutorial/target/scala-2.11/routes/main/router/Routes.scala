// @GENERATOR:play-routes-compiler
// @SOURCE:D:/latest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Aug 01 12:43:44 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  getController_2: controllers.getController,
  // @LINE:11
  delController_1: controllers.delController,
  // @LINE:12
  updateController_3: controllers.updateController,
  // @LINE:13
  createController_0: controllers.createController,
  // @LINE:15
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    getController_2: controllers.getController,
    // @LINE:11
    delController_1: controllers.delController,
    // @LINE:12
    updateController_3: controllers.updateController,
    // @LINE:13
    createController_0: controllers.createController,
    // @LINE:15
    Assets_4: controllers.Assets
  ) = this(errorHandler, getController_2, delController_1, updateController_3, createController_0, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, getController_2, delController_1, updateController_3, createController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """id<[^/]+>""", """controllers.getController.get(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """del/""" + "$" + """id<[^/]+>""", """controllers.delController.del(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """put/""" + "$" + """id<[^/]+>""", """controllers.updateController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.createController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_getController_get0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_getController_get0_invoker = createInvoker(
    getController_2.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.getController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_delController_del1_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_delController_del1_invoker = createInvoker(
    delController_1.del(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.delController",
      "del",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_updateController_update2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("put/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_updateController_update2_invoker = createInvoker(
    updateController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.updateController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """put/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_createController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_createController_create3_invoker = createInvoker(
    createController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.createController",
      "create",
      Nil,
      "POST",
      this.prefix + """post""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_getController_get0_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_getController_get0_invoker.call(getController_2.get(id))
      }
  
    // @LINE:11
    case controllers_delController_del1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_delController_del1_invoker.call(delController_1.del(id))
      }
  
    // @LINE:12
    case controllers_updateController_update2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_updateController_update2_invoker.call(updateController_3.update(id))
      }
  
    // @LINE:13
    case controllers_createController_create3_route(params@_) =>
      call { 
        controllers_createController_create3_invoker.call(createController_0.create)
      }
  
    // @LINE:15
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
