package com.collegeProject.repository;

import com.collegeProject.model.MasterAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterAccountRepository extends JpaRepository<MasterAccount,Integer> {
}
