package com.g3appdev.chickenproben.RepositoryAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3appdev.chickenproben.EntityAPI.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
