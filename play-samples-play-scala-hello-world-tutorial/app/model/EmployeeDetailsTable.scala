package model

import play.api.libs.functional.syntax.{toFunctionalBuilderOps, unlift}
import play.api.libs.json.{JsPath, Json, Reads, Writes}
import slick.jdbc.MySQLProfile.api.{Table, anyToShapedValue, longColumnType, stringColumnType}
import slick.lifted.Tag

case class Employeestructure (

                                            id:Option[Long],
                                            FirstName : String,
                                            LastName : String,
                                            PhoneNumber : String
                                          )



class EmployeeDetailsTable(tag: Tag) extends Table[Employeestructure](tag, "employee_details") {
  def id = column[Option[Long]]("id", O.PrimaryKey,O.AutoInc)
  def FirstName = column[String]("FirstName")
  def LastName = column[String]("LastName")
  def PhoneNumber = column[String]("PhoneNumber")


def * = (
id,
FirstName,
LastName,
PhoneNumber) <> (
(Employeestructure.apply _).tupled,
  Employeestructure.unapply)
}


object Employeestructure {
  implicit val writes = new Writes[Employeestructure] {
    def writes(employeeDTO:Employeestructure) = Json.obj(
      "id" -> employeeDTO.id,
      "FirstName" -> employeeDTO.FirstName,
      "LastName" -> employeeDTO.LastName,
      "PhoneNumber" -> employeeDTO.PhoneNumber)
  }

  implicit val reads: Reads[Employeestructure] = (
    (JsPath \ "id").readNullable[Long] and
      (JsPath \ "FirstName").read[String] and
      (JsPath \ "LastName").read[String] and
      (JsPath \ "PhoneNumber").read[String])(Employeestructure.apply _)
}