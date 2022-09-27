package mx.itesm.ag.notifremota

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class ServicioMensajesFB : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        println("Token de esta app: $token")
        //registrarTokenBD(token)  // API
    }

    override fun onMessageReceived(message: RemoteMessage) {
        println("llega NOTIFICACIÓN REMOTA!!!!!!!!!")
    }
}