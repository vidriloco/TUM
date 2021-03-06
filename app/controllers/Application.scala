package controllers

import com.codahale.jerkson.Json

import play.api._
import play.api.mvc._

import models._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.application.index())
  }

	def contribute = Action {
		Ok(views.html.application.contribute())
	}

	def map = Action {
		Ok(views.html.application.map())
	}
  
}