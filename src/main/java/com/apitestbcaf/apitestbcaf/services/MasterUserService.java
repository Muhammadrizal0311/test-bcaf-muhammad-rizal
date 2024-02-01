package com.apitestbcaf.apitestbcaf.services;

import com.apitestbcaf.apitestbcaf.models.entity.MasterUser;
import com.apitestbcaf.apitestbcaf.models.repos.MasterUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MasterUserService {

    @Autowired
    private MasterUserRepository masterUserRepository;

    public MasterUser saveUser(MasterUser user){
        return masterUserRepository.save(user);
    }

    public MasterUser findOneUser(Long id){
        return masterUserRepository.findById(id).orElse(null);
    }

    public Iterable<MasterUser> findAllUser() {
        return masterUserRepository.findAll();
    }

    public String removeUser(Long id) {
        masterUserRepository.deleteById(id);
        return "Data Berhasil di Hapus !!!";
    }

    public List<MasterUser> findByUserName(String username) {
        return masterUserRepository.findByNameContain(username);
    }
}
