package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActivePackagesInRequest;
import io.swagger.model.BundleAndHardwareTuple;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestForBundleAndHardware
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T08:37:44.933Z")
@Data
public class RequestForBundleAndHardware {
	@JsonProperty("activePackages")
	@Valid
	private List<ActivePackagesInRequest> activePackages = null;

	@JsonProperty("billingType")
	private String billingType = null;

	@JsonProperty("bundleAndHardwareList")
	@Valid
	private List<BundleAndHardwareTuple> bundleAndHardwareList = null;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("offerCode")
	private String offerCode = null;

	@JsonProperty("packageType")
	private String packageType = null;

}
