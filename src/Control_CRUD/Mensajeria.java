/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_CRUD;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author jefferson
 */
public class Mensajeria {
    //gmail
    // public static String host = "smtp.gmail.com";       
    //email
    //public static String host = "smtp.live.com";

    public static String Username = "jeffersonalexycarrillom06ing@gmail.com";
    public static String PassWord = "contsenea123";
    public static String host = "smtp.gmail.com";
    public static String puerto = "587";
    String correo_mensaje = "";
    String correo_para = "";
    String correo_asunto = "";

    public void enviar_mail(String para, String asunto, String mensaje, String HTML) {
        correo_para = para;
        correo_asunto = asunto;
        correo_mensaje = mensaje;
        Properties propiedades = System.getProperties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", host);
        propiedades.put("mail.smtp.port", puerto);

        // Obtenemos la sesión por defecto
        // Session sesion = Session.getDefaultInstance(propiedades);
        Session session = Session.getInstance(propiedades,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, PassWord);
                    }
                });

        try {
            // Creamos un objeto mensaje tipo MimeMessage por defecto.            
            MimeMessage mensajes = new MimeMessage(session);
            // Asignamos el “de o from” al header del correo.
            mensajes.setFrom(new InternetAddress(Username));
            // Asignamos el “para o to” al header del correo.
            mensajes.addRecipient(Message.RecipientType.TO, new InternetAddress(para));
            // Asignamos el asunto
            mensajes.setSubject(asunto);
            // Asignamos el contenido HTML, tan grande como nosotros queramos
            mensajes.setContent(HTML, "text/html");

            // Enviamos el correo
            Transport.send(mensajes);
            System.out.println("Mensaje enviado");
            
        } catch (MessagingException e) {
           System.out.println("ERROR MENSAJERIA "+e);
        }
    }
}
