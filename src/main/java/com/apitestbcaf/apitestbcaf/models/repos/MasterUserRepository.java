package com.apitestbcaf.apitestbcaf.models.repos;

import com.apitestbcaf.apitestbcaf.models.entity.MasterUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterUserRepository extends JpaRepository<MasterUser, Long> {

    default List<MasterUser> findByNameContain(String name) { return null;}

}
