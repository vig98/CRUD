// @GENERATOR:play-routes-compiler
// @SOURCE:D:/latest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Aug 01 12:43:44 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
