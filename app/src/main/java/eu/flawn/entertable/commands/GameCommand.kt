package eu.flawn.entertable.commands;

import eu.flawn.entertable.Config
import eu.flawn.entertable.requests.Request

/**
 * @author Flawn
 */
public class GameCommand : Command {
    override var name = "GameCommand";
    override fun sendRequest() {
        var request = Request("game", Config.serverAdress, Config.serverPort)
    }
}
