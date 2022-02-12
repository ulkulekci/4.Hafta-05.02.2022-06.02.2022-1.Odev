package com.innova.single_responsibility;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter@Setter
    private Long id;
    private String name;
    private String city;
    private String street;
    private String username;

    public void Address(String street, String city){
    }

    public void login(String username){

    }
    public void logout(String username){
        // Yeni bir adres bilgisi istense bu sınıf etkilenecek street city gibi veriler sadece bu adres için geçerli
       //yeni bir class oluşturalım
    }


}
