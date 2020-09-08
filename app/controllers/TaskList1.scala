package controllers
import javax.inject._
import play.api.mvc._

@Singleton
class TaskList1 @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def taskList =  Action {
    val tasks = List("sleep", "code", "yoga", "eat", "play with booboo")
    Ok(views.html.taskList1(tasks))
   }
  }

