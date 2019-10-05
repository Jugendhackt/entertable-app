package eu.flawn.entertable.networking

import android.os.AsyncTask
import java.io.PrintWriter
import java.net.Socket

/**
 * @author Flawn
 */

class SocketService(var host: String, var port: Int) : AsyncTask<String, Void, String>() {

    override fun doInBackground(vararg p0: String?): String {

        val socket = Socket(host, port)

        val writer = PrintWriter(socket.getOutputStream(), true)

        writer.write(p0[0] as String)
        writer.close()

        return "1";
    }
}