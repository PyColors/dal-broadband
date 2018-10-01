
package com.vf.uk.dal.broadband.authorizer;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;

@Component
public class BroadbandAuthorizationHelper {

	@Value("${dal.authorization.enabled}")
	private String authorizationEnabled;

	

	/**
	 * 
	 * @param broadbandId
	 * @param assuranceLevels
	 * @return
	 */
	public void authorizeRequest(String broadbandId,String... assuranceLevels) {
		if (StringUtils.isNotBlank(authorizationEnabled) && BooleanUtils.toBoolean(authorizationEnabled)) {
			if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
				com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer
						.validatePlatformSessionIdAccess(broadbandId, assuranceLevels);
			} else {
				throw new BroadbandJourneyCustomException("401", "Access is denied as authorization is missing", "ACCESS_DENIED_MISSING_AUTHORIZATION");
			}
		}
	}
	/**
	 * 
	 * @param assuranceLevels
	 * @return
	 */
	public void authorizeAnonymousRequest(String... assuranceLevels) {
		if (StringUtils.isNotBlank(authorizationEnabled) && BooleanUtils.toBoolean(authorizationEnabled)) {
			if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
				com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer
				.validateAssuranceLevel(assuranceLevels);
			} else {
				throw new BroadbandJourneyCustomException("401", "Access is denied as authorization is missing", "ACCESS_DENIED_MISSING_AUTHORIZATION");
			}
		}
	}
}
