package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ProductsController {

    static class UserProfileRequest {
        private String name;
        private Date birthDate;
        private String role;
        // Getters and setters omitted for brevity

        public String getName() {return this.name;}
        public Date getDateofBirth() {return this.birthDate;}
        public String getRole() {return this.role;}

        public void setName(String name) {this.name = name;}
        public void setBirthDate(Date date) {this.birthDate = date;}
        public void setRole(String role) {this.role= role;}

    }

    /*This @ModelAttribute using Controller advice is old way and we can use @RequestBody and Jackson to validate the required*/
    @PostMapping("/public/info/create")
    public Map<String,String> createUserInfo(@ModelAttribute UserProfileRequest request) {
        Map<String, String> response = new HashMap<>();
        response.put("processedName", request.getName());
        response.put("processedBirthDate", request.getDateofBirth().toString());
        response.put("processedRole", request.getRole()); // Blocked and will be null
        return response;
    }

    @GetMapping("/public/info")
    public ResponseEntity<Map<String, String>> getPublicInfo() throws Exception {
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Success");
        if (true) {
            throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(response);

    }

    /* Example JWT:
    KeyoCloack - {sub=82ca58fe-3ef6-4afd-8765-52a274576262, resource_access={account={roles=[manage-account, manage-account-links, view-profile]}}, email_verified=false, iss=http://localhost:9090/realms/microservice-realm, typ=Bearer, preferred_username=testuser, given_name=test, sid=CgVWtGKgq6io6EDvgS-DUjg2, aud=[account], acr=1, realm_access={roles=[offline_access, uma_authorization, default-roles-microservice-realm]}, azp=product-service-client, scope=profile email, name=test test, exp=2026-10-19T08:09:24Z, iat=2026-10-19T08:04:24Z, family_name=test, jti=onrtro:9c5a27ce-99e5-3011-3a9f-86d8c29d4f8d, email=testuser@testmail.com}
    Google oAuth - {at_hash=DbhWqau5nLMq4WAAHdfWXg, sub=114817658952520719386, email_verified=true, iss=https://accounts.google.com, given_name=Murugan, picture=https://lh3.googleusercontent.com/a/ACg8ocIOWchP5Vs7qtkga-VILA1NX65fFleyA0FxiFcD_9hCb9W5bvI=s96-c, aud=[395253792581-ge8h01rj04nm85mhjejs5s67hpu9qovr.apps.googleusercontent.com], azp=395253792581-ge8h01rj04nm85mhjejs5s67hpu9qovr.apps.googleusercontent.com, name=Murugan S, exp=2026-10-19T10:22:07Z, family_name=S, iat=2026-10-19T09:22:07Z, email=murugansrinivasanppt@gmail.com}
    * */

//    @PreAuthorize("hasAnyRole('CUSTOMER', 'ADMIN')") -- this will help to authorize only the role the particular user is requesting for
//    @PreAuthorize("hasRole('ADMIN')")
//    @PreAuthorize("authentication.name == #username or hasRole('ADMIN')")
    /* OAuth Authorization, APID authentication are different ways we can safeguard Api's*/
    @GetMapping(value = "/getproducts", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Map<String,List<List<String>>>> getProducts(@AuthenticationPrincipal Jwt jwt) {
        System.out.println("Received the Request.., JWT: "+ jwt.getClaims());
        String username = jwt.getClaimAsString("preferred_username");

        String note = "Hello Mr. "+username;

        List<List<String>> result = new ArrayList<>();

        result.add(List.of(note));
        result.add(List.of("apple", "orange", "pomegranete"));
        result.add(List.of("brinjal", "tomato", "carrot"));
        result.add(List.of("turmeric_powder", "chilli_powder", "salt", "sugar"));

        Map<String,List<List<String>>> response = new HashMap<>();
        response.put("response", result);

        return ResponseEntity.ok(response);
    }

//    curl --location "http://localhost:9090/realms/microservice-realm/protocol/openid-connect/token" ^
//            --header "Content-Type: application/x-www-form-urlencoded" ^
//            --data-urlencode "client_id=product-service-client" ^
//            --data-urlencode "username=testuser" ^
//            --data-urlencode "password=password" ^
//            --data-urlencode "grant_type=password"


//    https://google.com?
//    client_id=YOUR_CLIENT_ID
//  &redirect_uri=YOUR_REDIRECT_URI
//  &response_type=code
//  &scope=openid%20email%20profile
//  &access_type=offline
//  &prompt=consent

//    https://google.com?client_id=395253792581-ge8h01rj04nm85mhjejs5s67hpu9qovr.apps.googleusercontent.com&redirect_uri=http://localhost:8080/getproducts&response_type=code&scope=openid%20email%20profile&access_type=offline&prompt=consent
}
