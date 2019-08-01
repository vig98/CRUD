import org.scalatest.{FlatSpec, FunSpec, Matchers}
import controllers.getController
import controllers.createController
import controllers.updateController
import controllers.delController
import dao.EmployeeDAO
import javax.inject.Inject
import play.api.libs.json.Json
import model.Employeestructure
import play.api.db.slick.DatabaseConfigProvider
import dao.EmployeeDAO
import play.api.mvc.ControllerComponents

class Basetest (cc: ControllerComponents,variab: EmployeeDAO) extends FlatSpec with Matchers{

  val emp = new getController(cc, variab)


  "getController" should "get val" in {
    emp.get(6) should be (null)
  }

}