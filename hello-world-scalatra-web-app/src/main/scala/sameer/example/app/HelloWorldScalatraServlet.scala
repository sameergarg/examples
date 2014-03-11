package sameer.example.app

import org.scalatra._
import scalate.ScalateSupport

class HelloWorldScalatraServlet extends HelloWorldScalatraWebAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, Sameer!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
