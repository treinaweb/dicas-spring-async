package br.com.treinaweb.springasync.core.services.mail;

import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Async;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FakeMailService implements MailService {

    @Async
    @Override
    public void send(String to, String subject, String body) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error("Erro ao enviar e-mail: {}", e.getMessage());
        }
        log.info("E-mail enviando para {} com o assunto {}", to, subject);
    }
    
}
