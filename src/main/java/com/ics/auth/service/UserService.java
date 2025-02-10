package com.ics.auth.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ics.auth.dto.LoginUserDTO;

@Service
public class UserService {
	//public ResponseEntity<?> login( ) {
//		try {
//			User existingUser = getRepository().findByEmail(userInput.getEmail());
//			if (existingUser != null) {
//				if (passwordEncoder.matches(userInput.getPassword(), existingUser.getPassword())) {
//					String generated_token = jwtutil.generateToken(existingUser);
//					LoginResponseDTO response = modelMapper.map(existingUser, LoginResponseDTO.class);
//					response.setToken(generated_token);
//					String refreshToken = refreshTokenService.generateToken(existingUser);
//					response.setRefreshToken(refreshToken);
//					TokenCheck tokencheck = TokenCheck.builder().token(generated_token).isvalid(true).user(existingUser)
//							.rtoken(refreshToken).build();
//					tokenRepository.save(tokencheck);
//					return ResponseEntity.ok(response);
//				}
//				return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
//						.body(ResponseEnum.INCORRECT_PASSWORD.getMessage());
//			}
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ResponseEnum.INCORRECT_EMAIL.getMessage());
//		} catch (Exception ex) {
//			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
//		}
//	}

	}
 
