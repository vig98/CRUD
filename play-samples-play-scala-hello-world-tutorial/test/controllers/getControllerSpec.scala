package controllers

import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.Stack
import dao.EmployeeDAO
import net.sf.ehcache.search.expression.EqualTo
import play.api.mvc.ControllerComponents
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.test.FakeRequest
import org.mockito.Mockito._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.mockito.MockitoSugar
import play.api.inject.Injector
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.test.Helpers._


class getControllerSpec extends FlatSpec with Matchers with MockitoSugar with ScalaFutures with GuiceOneAppPerSuite{
  private lazy val appBuilder: GuiceApplicationBuilder = new GuiceApplicationBuilder()
  private lazy val injector: Injector = appBuilder.injector()
  val mockDAO = injector.instanceOf[EmployeeDAO]
  val mockCC =stubControllerComponents()
 // val controller = new getController(mockCC, mockDAO)

  "getController" should  "take ids which are present" in {
    //val fakeRequest = FakeRequest(GET, "/id")
     // .withHeaders(HOST -> "localhost:8080")

    val controller= new getController(mockCC,mockDAO)// should be called SomethingController

    val res = controller.get(2).apply(FakeRequest(GET,"/:id"))

    //status(result) should be (OK)

    assert(status(res) == 200)


  }

   "getController" should  "take ids which not present" in {
    //val fakeRequest = FakeRequest(GET, "/id")
    // .withHeaders(HOST -> "localhost:8080")
    val controller= new getController(mockCC,mockDAO)// should be called SomethingController

    val res = controller.get(4).apply(FakeRequest(GET,"/:id"))

    //status(result) should be (OK)

    val j=contentAsJson(res).toString()
     j should be ("null")


  }
}