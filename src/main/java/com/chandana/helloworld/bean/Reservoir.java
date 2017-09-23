package com.chandana.helloworld.bean;

import io.swagger.annotations.ApiModelProperty;

public class Reservoir {
  @ApiModelProperty(notes = "測站名稱(SiteName),文字")
  private String siteName;

  @ApiModelProperty(notes = "測站英文名稱(SiteEngName),文字")
  private String siteEngName;

  @ApiModelProperty(notes = "縣市(County),文字")
  private String county;

  @ApiModelProperty(notes = "鄉鎮市區(Township),文字")
  private String township;

  @ApiModelProperty(notes = "水庫名稱(DamName),文字")
  private String damName;

  @ApiModelProperty(notes = "水庫分類(DamRank),文字")
  private String damRank;

  @ApiModelProperty(notes = "TWD97經度(TWD97Lon),數字")
  private double twd97Lon;

  @ApiModelProperty(notes = "TWD97緯度(TWD97Lat),數字")
  private double twd97Lat;

  @ApiModelProperty(notes = "TWD97二度分帶X(TWD97TM2X),數字")
  private double twd97TM2x;

  @ApiModelProperty(notes = "TWD97二度分帶Y(TWD97TM2Y),數字")
  private double twd97TM2y;

  @ApiModelProperty(notes = "測站位置描述(SiteAddress),文字")
  private String siteAddress;

  @ApiModelProperty(notes = "測站狀態(StatusOfUse),文字")
  private String statusOfUse;

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

  public String getDamName() {
    return damName;
  }

  public void setDamName(String damName) {
    this.damName = damName;
  }

  public String getDamRank() {
    return damRank;
  }

  public void setDamRank(String damRank) {
    this.damRank = damRank;
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

  public double getTwd97TM2x() {
    return twd97TM2x;
  }

  public void setTwd97TM2x(double twd97TM2x) {
    this.twd97TM2x = twd97TM2x;
  }

  public double getTwd97TM2y() {
    return twd97TM2y;
  }

  public void setTwd97TM2y(double twd97TM2y) {
    this.twd97TM2y = twd97TM2y;
  }

  public String getSiteAddress() {
    return siteAddress;
  }

  public void setSiteAddress(String siteAddress) {
    this.siteAddress = siteAddress;
  }

  public String getStatusOfUse() {
    return statusOfUse;
  }

  public void setStatusOfUse(String statusOfUse) {
    this.statusOfUse = statusOfUse;
  }
}
