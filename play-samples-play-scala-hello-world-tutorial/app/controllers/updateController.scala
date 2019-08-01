package controllers

import dao.EmployeeDAO
//import dto.EmployeeDTO
import javax.inject.Inject
import model.Employeestructure
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

class updateController  @Inject()(cc: ControllerComponents,variab: EmployeeDAO) extends AbstractController(cc) {



  def update(id: Long) = Action.async(parse.json) { implicit request =>
    var employee = request.body.as(Employeestructure.reads)
    var resultObj = variab.updateEmployeestructure(id, employee)
    var result = Await.result(resultObj, Duration.Inf)
    Future { Ok(Json.toJson(result)) }
    //}
  }
}