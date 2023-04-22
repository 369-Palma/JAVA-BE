package com.palma.gestione_dispositivi.auth.service;

import com.palma.gestione_dispositivi.auth.payload.LoginDto;
import com.palma.gestione_dispositivi.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
