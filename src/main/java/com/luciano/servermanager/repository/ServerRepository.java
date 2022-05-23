package com.luciano.servermanager.repository;

import com.luciano.servermanager.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> { //JpaRepository needs the actual class to be managed by JPA and the type of the primary key
    Server findByIpAddress(String ipAddress); // "findBy" keyword will tell JPA to select a Server class with the specified requirements
}
