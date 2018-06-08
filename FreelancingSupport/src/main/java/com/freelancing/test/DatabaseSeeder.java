package com.freelancing.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner{

	private BookingRepository bookingRepository;
	
	@Autowired
	public DatabaseSeeder(BookingRepository bookingRepository){
		this.bookingRepository = bookingRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {


		List<ProjectBooking> bookings = new ArrayList<>();
		
		bookings.add(new ProjectBooking("Cars Website", "Philip Lon", 5, 101.1));
		bookings.add(new ProjectBooking("Plane web application", "Lara Kroft", 4, 332.11));
		bookings.add(new ProjectBooking("Toys Wordpress Website", "Ion Stefan", 2, 280.20));
		
		bookingRepository.saveAll(bookings);
	}
}
