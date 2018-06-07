package com.freelancing.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class ProjectBookingController {

	private List<ProjectBooking> bookings;

	public ProjectBookingController() {

		bookings = new ArrayList<>();
		bookings.add(new ProjectBooking("Cars Website", "Philip Lon", 5, 101.1));
		bookings.add(new ProjectBooking("Plane web application", "Lara Kroft", 4, 332.11));
		bookings.add(new ProjectBooking("Toys Wordpress Website", "Ion Stefan", 2, 280.20));
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<ProjectBooking> getAll() {
		return bookings;
	}

	@RequestMapping(value = "/value/{price}", method = RequestMethod.GET)
	public List<ProjectBooking> getProjectValue(@PathVariable double price) {

		return bookings.stream().filter(x -> x.getTotalPrice() >= price).collect(Collectors.toList());
	}
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<ProjectBooking> create(@RequestBody ProjectBooking projectBooking){
		bookings.add(projectBooking);
		return bookings;
	}
}
