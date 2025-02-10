package com.ics.auth.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ics.auth.util.JwtUtil;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ZooFilter extends OncePerRequestFilter {
	
	 
	@Autowired
	private JwtUtil jwtutil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String authorizationHeader = request.getHeader("Authorization");
		if (authorizationHeader != null) {
			String token_frontend = authorizationHeader.substring(7);
			if (ObjectUtils.isEmpty(token_frontend) || token_frontend.equals("null")) {
				filterChain.doFilter(request, response);
				return;
			}
			Boolean isValid= jwtutil.validateToken(token_frontend);
			if(isValid)
			{
				String username = jwtutil.extractUsername(token_frontend);
			if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				//setContext
				System.out.println("user is validate");
				}
				else {
					System.out.println("Invalid or expired token");
				}
			}
		}
		 

		filterChain.doFilter(request, response);
	}
		
		
		 
		
	}

 
