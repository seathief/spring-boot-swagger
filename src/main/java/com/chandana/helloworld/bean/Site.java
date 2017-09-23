package com.chandana.helloworld.bean;

import io.swagger.annotations.ApiModelProperty;

public class Site {
  @ApiModelProperty(notes = "測站名稱")
  private String siteName;

  @ApiModelProperty(notes = "測站英文名稱")
  private String siteEngName;

  @ApiModelProperty(notes = "空品區")
  private String areaName;

  @ApiModelProperty(notes = "縣市")
  private String county;

  @ApiModelProperty(notes = "鄉鎮")
  private String township;

  @ApiModelProperty(notes = "測站地址")
  private String siteAddres;

  @ApiModelProperty(notes = "經度")
  private double twd97Lon;

  @ApiModelProperty(notes = "緯度")
  private double twd97Lat;

  @ApiModelProperty(notes = "測站類型")
  private String siteType;

  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public String getSiteEngName() {
    return siteEngName;
  }

  public void setSiteEngName(String siteEngName) {
    this.siteEngName = siteEngName;
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getTownship() {
    return township;
  }

  public void setTownship(String township) {
    this.township = township;
  }

  public String getSiteAddres() {
    return siteAddres;
  }

  public void setSiteAddres(String siteAddres) {
    this.siteAddres = siteAddres;
  }

  public double getTwd97Lon() {
    return twd97Lon;
  }

  public void setTwd97Lon(double twd97Lon) {
    this.twd97Lon = twd97Lon;
  }

  public double getTwd97Lat() {
    return twd97Lat;
  }

  public void setTwd97Lat(double twd97Lat) {
    this.twd97Lat = twd97Lat;
  }

  public String getSiteType() {
    return siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }
}
