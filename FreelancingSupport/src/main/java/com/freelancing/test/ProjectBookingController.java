package com.freelancing.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class ProjectBookingController {

	private BookingRepository bookingRepository;

	@Autowired
	public ProjectBookingController(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<ProjectBooking> getAll() {
		return bookingRepository.findAll();
	}

	@RequestMapping(value = "/value/{price}", method = RequestMethod.GET)
	public List<ProjectBooking> getProjectValue(@PathVariable double price) {

		return bookingRepository.findByProjectSprintPriceGreaterThan(price);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<ProjectBooking> create(@RequestBody ProjectBooking projectBooking) {
		bookingRepository.save(projectBooking);

		return bookingRepository.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public List<ProjectBooking> remove(@PathVariable long id) {
		bookingRepository.deleteById(id);

		return bookingRepository.findAll();
	}
}
