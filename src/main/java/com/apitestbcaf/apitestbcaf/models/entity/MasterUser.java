package com.apitestbcaf.apitestbcaf.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Master_User")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MasterUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, name = "username")
    @NotBlank(message = "Username tidak boleh kosong !!!")
    @NotEmpty(message = "Username tidak boleh kosong !!!")
    private String username;

    @Column(length = 6, name = "password")
    @NotBlank(message = "password tidak boleh kosong !!!")
    @NotEmpty(message = "password tidak boleh kosong !!!")
    private String password;

    @Column( name = "createdDate")
    private String createDateTime;

    @Column(length = 100, name = "createdBy")
    @NotBlank(message = "Created By tidak boleh kosong !!!")
    @NotEmpty(message = "Created By tidak boleh kosong !!!")
    private String createdBy;

    @Column(length = 10, name = "statusUser")
    @NotBlank(message = "status User tidak boleh kosong !!!")
    @NotEmpty(message = "status User tidak boleh kosong !!!")
    private String statusUser;

    @Column( name = "idMenu")
    private int idMenu;

    @Column( name = "idCabang")
    private int idCabang;

    @Column( name = "groupUser")
    private int groupUser;

    @Column( name = "idArea")
    private int idArea;



}
