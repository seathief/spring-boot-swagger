package com.chandana.helloworld.bean;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class AQI {

  @ApiModelProperty(notes = "空氣品質指標(AQI),數字")
  private int aqi;

  @ApiModelProperty(notes = "一氧化碳(ppm)(CO),數字")
  private double co;

  @ApiModelProperty(notes = "一氧化碳8小時移動平均(ppm)(CO_8hr),數字")
  private double co_8hr;

  @ApiModelProperty(notes = "縣市(County),文字", required =true)
  private String country;

  @ApiModelProperty(notes = "一氧化氮(ppb)(NO),數字")
  private double no;

  @ApiModelProperty(notes = "二氧化氮(ppb)(NO2),數字")
  private double no2;

  @ApiModelProperty(notes = "氮氧化物(ppb)(NOx),數字")
  private double nox;

  @ApiModelProperty(notes = "臭氧(ppb)(O3),數字")
  private double o3;

  @ApiModelProperty(notes = "臭氧8小時移動平均(ppb)(O3_8hr)")
  private double o3_8hr;

  @ApiModelProperty(notes = "懸浮微粒(μg/m3)(PM10),數字")
  private double pm10;

  @ApiModelProperty(notes = "懸浮微粒移動平均(μg/m3)(PM10_AVG),數字")
  private double pm10_avg;

  @ApiModelProperty(notes = "細懸浮微粒(μg/m3)(PM2.5),數字或'ND'")
  private double pm25;

  @ApiModelProperty(notes = "細懸浮微粒移動平均(μg/m3)(PM2.5_AVG),數字")
  private double pm25_avg;

  @ApiModelProperty(notes = "空氣污染指標物(Pollutant),文字,{一氧化碳、臭氧、二氧化氮、\n"
      + "二氧化硫、懸浮微粒、細懸浮\n"
      + "微粒、臭氧八小時}")
  private String pollutant;

  @ApiModelProperty(notes = "資料建置日期(DataCreationDate),日期()")
  private String publishTime;

  @ApiModelProperty(notes = "二氧化硫(ppb)(SO2),數字")
  private double so2;

  @ApiModelProperty(notes = "測站名稱(SiteName),文字", required =true)
  private String siteName;

  @ApiModelProperty(notes = "狀態,文字,{良好、普通、對敏感族群不良\n"
      + "、對所有族群不良、非常不良\n"
      + "、有害、設備維護}")
  private String status;

  @ApiModelProperty(notes = "風向(degrees),數字")
  private double windDirec;

  @ApiModelProperty(notes = "風速(m/sec),數字")
  private double windSpeed;

  public int getAqi() {
    return aqi;
  }

  public void setAqi(int aqi) {
    this.aqi = aqi;
  }

  public double getCo() {
    return co;
  }

  public void setCo(double co) {
    this.co = co;
  }

  public double getCo_8hr() {
    return co_8hr;
  }

  public void setCo_8hr(double co_8hr) {
    this.co_8hr = co_8hr;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getNo() {
    return no;
  }

  public void setNo(double no) {
    this.no = no;
  }

  public double getNo2() {
    return no2;
  }

  public void setNo2(double no2) {
    this.no2 = no2;
  }

  public double getNox() {
    return nox;
  }

  public void setNox(double nox) {
    this.nox = nox;
  }

  public double getO3() {
    return o3;
  }

  public void setO3(double o3) {
    this.o3 = o3;
  }

  public double getO3_8hr() {
    return o3_8hr;
  }

  public void setO3_8hr(double o3_8hr) {
    this.o3_8hr = o3_8hr;
  }

  public double getPm10() {
    return pm10;
  }

  public void setPm10(double pm10) {
    this.pm10 = pm10;
  }

  public double getPm10_avg() {
    return pm10_avg;
  }

  public void setPm10_avg(double pm10_avg) {
    this.pm10_avg = pm10_avg;
  }

  public double getPm25() {
    return pm25;
  }

  public void setPm25(double pm25) {
    this.pm25 = pm25;
  }

  public double getPm25_avg() {
    return pm25_avg;
  }

  public void setPm25_avg(double pm25_avg) {
    this.pm25_avg = pm25_avg;
  }

  public String getPollutant() {
    return pollutant;
  }

  public void setPollutant(String pollutant) {
    this.pollutant = pollutant;
  }

  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }

  public double getSo2() {
    return so2;
  }

  public void setSo2(double so2) {
    this.so2 = so2;
  }

  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public double getWindDirec() {
    return windDirec;
  }

  public void setWindDirec(double windDirec) {
    this.windDirec = windDirec;
  }

  public double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(double windSpeed) {
    this.windSpeed = windSpeed;
  }
}
