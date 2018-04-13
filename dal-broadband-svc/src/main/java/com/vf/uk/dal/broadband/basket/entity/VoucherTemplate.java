package com.vf.uk.dal.broadband.basket.entity;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author sahil.monga
 *
 */
public class VoucherTemplate {

	private String voucherId;
	private String voucherName;
	private String voucherCode;
	private String description;
	private Date startDate;
	private Date endDate;
	private int maxRedemptionCount;
	private int reserveCount;
	private String batchPrefix;
	private int redemptionCount;
	private String tag;
	private List<VoucherMP> merchandisingPromotions;

	
	
	public int getReserveCount() {
		return reserveCount;
	}

	public void setReserveCount(int reserveCount) {
		this.reserveCount = reserveCount;
	}

	public String getBatchPrefix() {
		return batchPrefix;
	}

	public void setBatchPrefix(String batchPrefix) {
		this.batchPrefix = batchPrefix;
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return voucherName;
	}

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<VoucherMP> getMerchandisingPromotions() {
		return merchandisingPromotions;
	}

	public int getMaxRedemptionCount() {
		return maxRedemptionCount;
	}

	public void setMaxRedemptionCount(int maxRedemptionCount) {
		this.maxRedemptionCount = maxRedemptionCount;
	}

	public int getRedemptionCount() {
		return redemptionCount;
	}

	public void setRedemptionCount(int redemptionCount) {
		this.redemptionCount = redemptionCount;
	}

	public void setMerchandisingPromotions(List<VoucherMP> merchandisingPromotions) {
		this.merchandisingPromotions = merchandisingPromotions;
	}

}
