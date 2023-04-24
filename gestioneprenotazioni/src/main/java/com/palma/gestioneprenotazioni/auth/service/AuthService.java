package com.palma.gestioneprenotazioni.auth.service;

import com.palma.gestioneprenotazioni.auth.payload.LoginDto;
import com.palma.gestioneprenotazioni.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
