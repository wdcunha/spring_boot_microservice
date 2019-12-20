package academy.devdojo.course.microservice.course.security.config;

import academy.devdojo.course.microservice.core.property.JwtConfiguration;
import academy.devdojo.course.security.config.SecurityTokenConfig;
import academy.devdojo.course.security.filter.JwtTokenAuthorizationFilter;
import academy.devdojo.course.security.token.converter.TokenConverter;
import academy.devdojo.course.security.token.creator.TokenCreator;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityCredentialsConfig extends SecurityTokenConfig {

    private final TokenConverter tokenConverter;

    public SecurityCredentialsConfig(JwtConfiguration jwtConfiguration, TokenCreator tokenCreator, TokenConverter tokenConverter) {
        super(jwtConfiguration);
        this.tokenConverter = tokenConverter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterAfter(new JwtTokenAuthorizationFilter(jwtConfiguration, tokenConverter), UsernamePasswordAuthenticationFilter.class);
        super.configure(http);

    }
}
