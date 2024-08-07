package com.healthconnect.repository;

import com.healthconnect.model.Billing;
import com.healthconnect.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findByUserAccount(UserAccount userAccount);
}