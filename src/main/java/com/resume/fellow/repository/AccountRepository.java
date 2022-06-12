package com.resume.fellow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.resume.fellow.models.Account;
import com.resume.fellow.models.Guest;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
    Guest findByLanguage(String language);
}
