package com.vf.uk.dal.broadband.utils;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vodafone.bankHolidays.pojo.BankHolidays;
import com.vodafone.dal.domain.repository.BankHolidaysRepository;

/**
 * @author Infosys limited
 *
 */
@Component("cohRepoProvider")
public class BroadbandCoherenceRepoProvider {
	/**
	 * 
	 * @return
	 */
	public BankHolidaysRepository getBankHolidayRepository() {
		return new BankHolidaysRepository();
	}

	/**
	 * Gets the bank holiday list.
	 *
	 * @param holidayRepo
	 *            the holiday repo
	 * @param startDate
	 *            the start date
	 * @param endDate
	 *            the end date
	 * @return the bank holiday list
	 */
	public List<BankHolidays> getBankHolidayList(BankHolidaysRepository holidayRepo, Date startDate, Date endDate) {
		return holidayRepo.getHolidays(startDate, endDate);
	}
}
