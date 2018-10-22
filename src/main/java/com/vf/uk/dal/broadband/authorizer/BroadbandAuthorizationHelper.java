
package com.vf.uk.dal.broadband.authorizer;

import org.springframework.stereotype.Component;

import com.vf.uk.dal.broadband.exception.BroadbandJourneyCustomException;
import com.vf.uk.dal.customer.auth.token.SubscriptionClaim;

@Component
public class BroadbandAuthorizationHelper {
	

	/**
	 * 
	 * @param broadbandId
	 * @param assuranceLevels
	 * @return
	 */
	public void authorizeRequest(String broadbandId,String... assuranceLevels) {
			if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
				com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer
						.validatePlatformSessionIdAccess(broadbandId, assuranceLevels);
			} else {
				throw new BroadbandJourneyCustomException("401", "Access is denied as authorization is missing", "ACCESS_DENIED_MISSING_AUTHORIZATION");
			}
	}
	/**
	 * 
	 * @param assuranceLevels
	 * @return
	 */
	public void authorizeAnonymousRequest(String... assuranceLevels) {
			if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
				com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer
				.validateAssuranceLevel(assuranceLevels);
			} else {
				throw new BroadbandJourneyCustomException("401", "Access is denied as authorization is missing", "ACCESS_DENIED_MISSING_AUTHORIZATION");
			}
	}
	
	public String getAccountIdFromAuthorization(){
        String subscriptionId = null;
        if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
            com.vf.uk.dal.authorization.filter.util.entity.SubscriptionClaim subscriptionClaim = com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext().getSubscription();
            subscriptionId = subscriptionClaim!=null?subscriptionClaim.getId():null;
        }
        return subscriptionId;
    }
	
	public String getAssuranceLevel(){
        String assuranceLevel = null;
        if (com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext() != null) {
        	assuranceLevel= com.vf.uk.dal.authorization.filter.util.context.CustomerAuthorizer.getAuthContext().getAssurance_level();
        	
        }
        return assuranceLevel;
    }
}
