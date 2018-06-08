package com.freelancing.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<ProjectBooking, Long> {

	List<ProjectBooking> findByProjectSprintPriceGreaterThan(double price);
}
