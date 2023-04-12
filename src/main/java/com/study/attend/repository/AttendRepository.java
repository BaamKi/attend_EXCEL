package com.study.attend.repository;

import com.study.attend.entity.Attend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttendRepository extends JpaRepository<Attend, Long> {
}
