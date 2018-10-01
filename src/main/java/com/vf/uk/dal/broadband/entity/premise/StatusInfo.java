package com.vf.uk.dal.broadband.entity.premise;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * The Class StatusInfo.
 */
@Data
public class StatusInfo {

	/** The status. */
	private String status = null;

	/** The error codes. */
	private List<String> errorCodes = new ArrayList<>();

}
