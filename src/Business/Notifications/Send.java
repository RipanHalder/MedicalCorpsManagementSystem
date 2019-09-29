/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Notifications;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Send {

    public void mail(String recipient, String subject, String body) {
        try {
            final String username = "medicalcorpsmanagementsystem@gmail.com";
            final String password = "Ripan Halder, Nilay Haryalripanmanish";

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    if ((username != null) && (username.length() > 0) && (password != null)
                            && (password.length() > 0)) {

                        return new PasswordAuthentication(username, password);
                    }
                    return null;

                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("medicalcorpsmanagementsystem@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
                message.setSubject(subject);
                message.setText(body);
                Transport.send(message);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }
    
    

    

    public String sms(String msg, String send, String number) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
            String data = "apikey=" + "UpqFYOBbjls-XO84MQ7jYmK4D9I3IMrYosTu7ejaQ6" + "&numbers=" + number + "&message=" + msg + "&sender=" + send;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();

            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS " + e);
            return "Error " + e;
        }
    }

}
