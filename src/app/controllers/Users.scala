package controllers

import play.api._
import play.api.mvc._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

case class User ( firstname: String, lastname: String, username: String )

object Users extends Controller {

    implicit val formats = DefaultFormats
  
  def list = Action {
    val u1 = User ( "Joshua", "Miller", "joshdmiller" )
    val u2 = User ( "Steve", "McQueen", "stevie" )
    val users = List(u1,u2)
    Ok ( write ( users ) ).withHeaders( ("Content-Type", "application/json" ), ( "Access-Control-Allow-Origin", "*" ) )
  }
  
}
