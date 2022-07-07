package com.revature.movieapp.auth;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;

@Component
public class JwtConfig {

    @Value("${jwt.secret}")
    private String salt;

    @Value("#{24 * 60 * 60 * 1000}")
    private int expiration;

    private final SignatureAlgorithm sigAlg = SignatureAlgorithm.HS256;

    private Key signInKey;

    @PostConstruct
    public void createSigninKey() {
        byte[] saltyBytes = DatatypeConverter.parseBase64Binary(salt);
        signInKey = new SecretKeySpec(saltyBytes, sigAlg.getJcaName());
    }

    public int getExpiration() {
        return expiration;
    }

    public SignatureAlgorithm getSigAlg() {
        return sigAlg;
    }

    public Key getSignInKey() {
        return signInKey;
    }
}
