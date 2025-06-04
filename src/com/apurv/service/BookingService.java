package com.apurv.service;

import java.util.List;

import com.apurv.beans.HistoryBean;
import com.apurv.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
