package com.kodilla.crud.hibernate.manytomany;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company,Integer> {
}
