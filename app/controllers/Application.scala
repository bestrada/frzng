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
		//response.setCookie("foo", "bar", "14d")
		Ok(views.html.home(code))
	}
	
	def channel = Action {
		Ok(views.html.channel())
	}
}