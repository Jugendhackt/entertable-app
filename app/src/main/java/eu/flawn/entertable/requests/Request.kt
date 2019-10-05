package eu.flawn.entertable.requests

import eu.flawn.entertable.Config
import eu.flawn.entertable.networking.SocketService

/**
 * @author Flawn
 */

class Request(var data: String){
    fun start(): Int{
        SocketService(Config.serverAdress, Config.serverPort).execute(data);
        return 1;
    }
}