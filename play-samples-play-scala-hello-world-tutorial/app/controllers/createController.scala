package controllers

import dao.EmployeeDAO
import javax.inject.Inject
import model.Employeestructure
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

class createController  @Inject()(cc: ControllerComponents,variab: EmployeeDAO) extends AbstractController(cc) {


  def create = Action.async(parse.json) { request =>
    request.body.validate[Employeestructure].map { emp =>
      variab.insert(emp).map {
        result => Created(Json.toJson(result))
      }

    }.recoverTotal {
      e => Future { Ok("Bad request") }
    }
  }
}