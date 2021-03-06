package vggames.shared

import scala.collection.JavaConverters._
import br.com.caelum.vraptor.Resource
import vggames.shared.vraptor.RequestData
import br.com.caelum.vraptor.Get
import br.com.caelum.vraptor.Result
import vggames.shared.player.PlayerSession
import br.com.caelum.vraptor.view.Results

@Resource
class GameReference(data : RequestData, game : Game, result : Result, session : PlayerSession) {

  @Get(Array("/theory/{gameName}"))
  def theory(gameName : String) = {
    result.permanentlyRedirectTo(this).reference(gameName);
    result.use(Results.nothing)
  }

  @Get(Array("/reference/{gameName}"))
  def reference(gameName : String) = {
    result.include("gameName", gameName)
    result.include("game", game)
    result.include("finishedGroups", session.finishedGroups.asJava)
  }

}