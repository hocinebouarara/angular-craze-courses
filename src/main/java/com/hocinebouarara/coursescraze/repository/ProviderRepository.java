package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long> {
}
