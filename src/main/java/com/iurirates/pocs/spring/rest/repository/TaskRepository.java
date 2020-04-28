package com.iurirates.pocs.spring.rest.repository;

import com.iurirates.pocs.spring.rest.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
