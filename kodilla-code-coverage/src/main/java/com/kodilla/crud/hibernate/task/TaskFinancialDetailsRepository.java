package com.kodilla.crud.hibernate.task;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {
}
