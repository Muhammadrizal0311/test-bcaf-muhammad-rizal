package com.apitestbcaf.apitestbcaf.controller;

import com.apitestbcaf.apitestbcaf.models.entity.MasterUser;
import com.apitestbcaf.apitestbcaf.services.MasterUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class MasterUserController {
    @Autowired
    private MasterUserService masterUserService;

    //    @ExceptionHandler
    @PostMapping
    public MasterUser createUser(@Valid @RequestBody MasterUser masterUser){
        return masterUserService.saveUser(masterUser);
    }

    @GetMapping
    public Iterable<MasterUser> findAllUser(){
        return masterUserService.findAllUser();
    }

    @GetMapping("/{id}")
    public MasterUser findOneUser(@PathVariable Long id) {
        return masterUserService.findOneUser(id);
    }

    @PutMapping
    public MasterUser updateUser(@RequestBody MasterUser masterUser) {
        return masterUserService.saveUser(masterUser);
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable Long id) {
        return masterUserService.removeUser(id);
    }


}
