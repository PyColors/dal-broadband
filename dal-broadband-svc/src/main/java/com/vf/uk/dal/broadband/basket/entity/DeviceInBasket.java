package com.vf.uk.dal.broadband.basket.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * DeviceInBasket
 */
public class DeviceInBasket   {
  private String id = null;

  private String deviceType = null;

  private String status = null;

  private String contract = null;

  private String name = null;

  private String manufacturer = null;

  private String color = null;

  private String capacity = null;

  private Price salePrice = null;

  private List<MediaLink> merchandisingMedia = new ArrayList<>();

  /**
   * 
   * @param id
   * @return
   */
  public DeviceInBasket id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique device id as available from the product catalogue
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @param deviceType
   * @return
   */
  public DeviceInBasket deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Will be hard coded to \"handset\" for the PoC
   * @return deviceType
  **/
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
/**
 * 
 * @param status
 * @return
 */
  public DeviceInBasket status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Will be hard coded to \"inStock\" for the PoC
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
/**
 * 
 * @param contract
 * @return
 */
  public DeviceInBasket contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Will be hard coded to \"postpay\" for the PoC
   * @return contract
  **/
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }
/**
 * 
 * @param name
 * @return
 */
  public DeviceInBasket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the device, as available from the product catalogue
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
/**
 * 
 * @param manufacturer
 * @return
 */
  public DeviceInBasket manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Name of the manufacturer
   * @return manufacturer
  **/
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
/**
 * 
 * @param color
 * @return
 */
  public DeviceInBasket color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color of the device, as available from the product catalogue
   * @return color
  **/
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
/**
 * 
 * @param capacity
 * @return
 */
  public DeviceInBasket capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Capavity of the device (memory), as available from the product catalgue
   * @return capacity
  **/
  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }
/**
 * 
 * @param salePrice
 * @return
 */
  public DeviceInBasket salePrice(Price salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Get salePrice
   * @return salePrice
  **/
  public Price getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(Price salePrice) {
    this.salePrice = salePrice;
  }
/**
 * 
 * @param merchandisingMedia
 * @return
 */
  public DeviceInBasket merchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
    return this;
  }
/**
 * 
 * @param merchandisingMediaItem
 * @return
 */
  public DeviceInBasket addMerchandisingMediaItem(MediaLink merchandisingMediaItem) {
    this.merchandisingMedia.add(merchandisingMediaItem);
    return this;
  }

   /**
   * Get merchandisingMedia
   * @return merchandisingMedia
  **/
  public List<MediaLink> getMerchandisingMedia() {
    return merchandisingMedia;
  }

  public void setMerchandisingMedia(List<MediaLink> merchandisingMedia) {
    this.merchandisingMedia = merchandisingMedia;
  }


  
}

