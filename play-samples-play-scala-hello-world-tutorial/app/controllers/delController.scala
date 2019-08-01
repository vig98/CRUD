package controllers

import scala.concurrent.Future
import dao.EmployeeDAO
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global

class delController  @Inject()(cc: ControllerComponents,variab: EmployeeDAO) extends AbstractController(cc) {


  def del(id: Long) = Action.async { request =>

    variab.delEmployeestructure(id).map { result =>
      Ok("Record Deleted")
    }
  }


}