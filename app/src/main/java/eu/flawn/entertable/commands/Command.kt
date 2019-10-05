package eu.flawn.entertable.commands;

/**
 * @author Flawn
 */
interface Command {
    var name: String;

    fun sendRequest();

    fun getCommandName(): String {
        return name;
    }
}
