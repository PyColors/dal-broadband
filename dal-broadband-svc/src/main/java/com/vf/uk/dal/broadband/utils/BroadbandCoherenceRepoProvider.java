package com.vf.uk.dal.broadband.utils;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vodafone.bankHolidays.pojo.BankHolidays;
import com.vodafone.dal.domain.repository.BankHolidaysRepository;

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
	 * 
	 * @param holidayRepo
	 * @param currentDate
	 * @param after2MonthsDate
	 * @return
	 */
	public List<BankHolidays> getBankHolidayList(BankHolidaysRepository holidayRepo, Date currentDate, Date after2MonthsDate) {
		return holidayRepo.getHolidays(currentDate, after2MonthsDate);
	}
}
