package code.snippet
import scala.xml._
import net.liftweb._
import util._
import http._
import common._
import Helpers._

class Login {
  def loginForm(xhtml: NodeSeq) = ".login" #> {
     var fname = ""
     var lname = ""
     
     def createUser(lastName: String) {
       //... the form's been submitted... do something
     }
                  
    "#fname" #> fname & 
    "#lname" #> { n:NodeSeq => Helpers.bind("lname", n, "lname" -> SHtml.text("", createUser _)) }              
  }
}