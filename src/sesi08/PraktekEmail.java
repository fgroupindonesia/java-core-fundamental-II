/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi08;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ASUS
 */
public class PraktekEmail {

    public void sendTo(String emailTujuan, String judul, String pesan) {

        String to = emailTujuan;
        String from = "gumuruh@gmail.com";
        String username = from;
        String pass = "bla-bla-bla";

        // konfigurasi smtp server
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, pass);
            }
        });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(judul);
            message.setText(pesan);
            Transport.send(message);

            System.out.println("Sent message sukses....");
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

}
