package org.generation.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	//essa classe existe na interface extendida
	
	@Override											//tratativa de erros
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService); 
	}
	@Bean
	public PasswordEncoder passowordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception  {
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll()
		.antMatchers("/usuarios/cadastrar").permitAll()
		.anyRequest().authenticated()
		.and().httpBasic()//para gerar a chave token			//SESSÃO Q VAI CRIAR VAI SER STATELESS, NÃO VAI GUARDAR SESSÃO(statless)
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)//ssMANAGEMENTindica a sessão q vms utilizar
		.and().cors()//habilita o cors
		.and().csrf().disable();//desabilita o crsf
		
		// ANTMATCHERS serve para liberar endpoints,alguns caminhos no comtrole
		//pra que o client tenha o acesso a eles sem precisar passar a chave token
		//anyReqquest.authenticated = as demais requisições terão q ser autenticadas
		

	
	}
	
	
	
}
