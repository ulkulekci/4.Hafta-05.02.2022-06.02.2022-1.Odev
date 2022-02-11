package com.innovaulku.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

 @Entity
 @Table(name = "patika")
 public class UsersModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Getter@Setter
     Integer id;
     @Getter@Setter
     String login;
     @Getter@Setter
     String password;
     @Getter@Setter
     String email;

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         UsersModel that = (UsersModel) o;
         return Objects.equals(id, that.id) && Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(email, that.email);
     }

     @Override
     public int hashCode() {
         return Objects.hash(id, login, password, email);
     }

     @Override
     public String toString() {
         return "UsersModel{" +
                 "id=" + id +
                 ", login='" + login + '\'' +
                 ", email='" + email + '\'' +
                 '}';
     }
 }
