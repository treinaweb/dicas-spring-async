package br.com.treinaweb.springasync.core.services.mail;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FakeMailService implements MailService {

    @Override
    public void send(String to, String subject, String body) {
        log.info("Enviando e-mail para {} com o assunto {}", to, subject);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error("Erro ao enviar e-mail: {}", e.getMessage());
        }
    }
    
}
