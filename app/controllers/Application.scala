package controllers

import javax.inject.{Singleton, Inject}
import play.api.{Configuration, Environment}
import play.api.mvc._

@Singleton
class Application @Inject()(config: Configuration, env: Environment) extends Controller {
  def index() = Action { implicit request =>
    Ok(s"Hello Play-Framework")
  }
}
