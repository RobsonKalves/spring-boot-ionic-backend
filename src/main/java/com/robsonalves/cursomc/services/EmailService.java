package com.robsonalves.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.robsonalves.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	
}
