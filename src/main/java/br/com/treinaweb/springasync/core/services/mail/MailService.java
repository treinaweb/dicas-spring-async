package br.com.treinaweb.springasync.core.services.mail;

public interface MailService {

    void send(String to, String subject, String body);
    
}
