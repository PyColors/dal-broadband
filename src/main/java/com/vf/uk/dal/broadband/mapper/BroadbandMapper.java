package com.vf.uk.dal.broadband.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.vf.uk.dal.broadband.basket.entity.BasketServicePoint;
import com.vf.uk.dal.broadband.cache.repository.entity.InstallationAddress;
import com.vf.uk.dal.broadband.cache.repository.entity.PriceForHardware;
import com.vf.uk.dal.broadband.cache.repository.entity.ServicePoint;
import com.vf.uk.dal.broadband.entity.BundleHeader;
import com.vf.uk.dal.broadband.entity.BundlePrice;
import com.vf.uk.dal.broadband.entity.ErrorInfo;
import com.vf.uk.dal.broadband.entity.FlbBundle;
import com.vf.uk.dal.broadband.entity.HardwarePrice;
import com.vf.uk.dal.broadband.entity.Price;
import com.vf.uk.dal.broadband.entity.RouterDetails;
import com.vf.uk.dal.broadband.entity.RouterProductDetails;
import com.vf.uk.dal.broadband.inventory.entity.DeliveryPrice;

@Mapper(componentModel = "spring")
public interface BroadbandMapper {

	@Mapping(target = "lineRefernece", source = "servicePoint.lineReference")
	@Mapping(target = "lineRefernece.lineDirectory", source = "servicePoint.lineReference.lineDirectoryList")
	@Mapping(target = "serviceReference.serviceLines", source = "servicePoint.serviceReference.serviceLinesList")
	// @Mapping(target="serviceReference.serviceLines.lineTreatments",
	// source="servicePoint.serviceReference.serviceLinesList.lineTreatmentList")
	// @Mapping(target="serviceReference.serviceLines.serviceLines",
	// source="servicePoint.serviceReference.serviceLinesList.serviceLineList")
	// @Mapping(target="serviceReference.serviceLines.serviceLines.serviceLineList.serviceLineTreatments",
	// source="servicePoint.serviceReference.serviceLinesList.serviceLineList.serviceLineTreatmentList")
	// @Mapping(target="serviceReference.serviceLines.serviceLines.serviceLineList.serviceLineTreatments.simValue",
	// source="servicePoint.serviceReference.serviceLinesList.serviceLineList.serviceLineTreatmentList.sIM2Value")
	BasketServicePoint servicePointToBasketServicePoint(final ServicePoint servicePoint);

	com.vf.uk.dal.broadband.entity.InstallationAddress addressToInstallationAddress(final InstallationAddress address);

	RouterDetails routerProductDetailsToRouterDetails(final RouterProductDetails routerProductDetails);

	FlbBundle bundleHeaderToFlbBundle(final BundleHeader bundleHeader);

	Price deliveryPriceToPrice(final DeliveryPrice dp);

	Price engPriceToPrice(final PriceForHardware priceForHardware);

	List<ErrorInfo> mapWarningMessage(final List<com.vf.uk.dal.entity.serviceavailability.ErrorInfo> errorInfo);

	BundlePrice bundlePrice(final com.vf.uk.dal.broadband.entity.price.BundlePrice bundlePriceFromPrice);

	HardwarePrice routerPrice(final com.vf.uk.dal.broadband.entity.price.HardwarePrice hardwarePrice);

}
