package com.vf.uk.dal.broadband.basket.entity;

public class PremiseAndServicePoint {

    private InstallationAddress installationAddress;
    private ServicePoint servicePoint;

    public InstallationAddress getInstallationAddress() {
        return installationAddress;
    }

    public void setInstallationAddress(InstallationAddress installationAddress) {
        this.installationAddress = installationAddress;
    }

    public ServicePoint getServicePoint() {
        return servicePoint;
    }

    public void setServicePoint(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }
}
