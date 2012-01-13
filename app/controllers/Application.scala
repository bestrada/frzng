package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
	
	def index = Action {
		Ok(views.html.index())
	}

	def where = Action {
		Ok(views.html.where())
	}
	
	def home(code: String) = Action {
		Ok(views.html.home(code))
	}
}