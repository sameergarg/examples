package com.github.sameer.example

import org.scalatra._
import javax.servlet.ServletContext
import com.github.sameer.example.app.HelloWorldScalatraServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new HelloWorldScalatraServlet, "/*")
  }
}
