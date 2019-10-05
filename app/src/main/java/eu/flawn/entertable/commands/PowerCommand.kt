package eu.flawn.entertable.commands;

import eu.flawn.entertable.requests.Request

/**
 * @author Flawn
 */
public class PowerCommand : Command  {
    fun PowerCommand(io: Int){
        this.status = io;
    }
    var status = 0;
    override var name = "PowerCommand";
    override fun sendRequest() {
        var req = Request("${status}")
    }

}
