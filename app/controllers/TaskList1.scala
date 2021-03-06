package controllers
import javax.inject._

import play.api.mvc._

@Singleton
class TaskList1 @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def login = Action {
    Ok(views.html.login1())
  }
  def validateLoginGet(username: String, password: String) = Action {
    Ok(s"$username and $password")
  }
  def validateLoginPost = Action { request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      Redirect(routes.TaskList1.taskList())
    }.getOrElse(Redirect(routes.TaskList1.login()))
  }
  def taskList =  Action {
    val tasks = List("sleep", "code", "yoga", "eat", "play with booboo")
    Ok(views.html.taskList1(tasks))
   }
  }

