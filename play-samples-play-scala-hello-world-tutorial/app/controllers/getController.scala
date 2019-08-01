package controllers

import dao.EmployeeDAO
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global

class getController  @Inject()(cc: ControllerComponents,variab: EmployeeDAO) extends AbstractController(cc) {


  def get(id: Long) = Action.async { request =>
    variab.getEmployeestructure(id).map { result =>
      Ok(Json.toJson(result))
    }
  }


}