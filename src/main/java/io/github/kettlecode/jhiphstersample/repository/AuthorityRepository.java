package io.github.kettlecode.jhiphstersample.repository;

import io.github.kettlecode.jhiphstersample.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
