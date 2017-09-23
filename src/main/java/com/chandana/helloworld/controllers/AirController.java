package com.chandana.helloworld.controllers;

import com.chandana.helloworld.bean.AQI;
import com.chandana.helloworld.bean.Site;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/air")
@Api(value = "Air", description = "環保署空氣品質Open API", tags = "大氣API")
public class AirController {

  @RequestMapping(value = "/aqis", method = RequestMethod.GET
      , produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "空氣品質指標(AQI)(清單)", notes="每小時提供各測站之空氣品質指標（AQI）" ,nickname = "AQI",response = AQI.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "成功"),
      @ApiResponse(code = 401, message = "拒絕存取"),
      @ApiResponse(code = 403, message = "禁止使用"),
      @ApiResponse(code = 404, message = "找不到"),
      @ApiResponse(code = 500, message = "內部伺服器錯誤")})
  public List<AQI> aqis() {
    List<AQI> aqiList = new ArrayList<>();

    AQI aqi1 = new AQI();
    aqi1.setAqi(146);
    aqi1.setCo(0.19);
    aqi1.setCo_8hr(0.2);
    aqi1.setCounty("彰化縣");
    aqi1.setNo(0.7);
    aqi1.setNo2(6.8);
    aqi1.setNox(7.5);
    aqi1.setO3(34);
    aqi1.setO3_8hr(34);
    aqi1.setPm10(87);
    aqi1.setPm10_avg(81);
    aqi1.setPm25(67);
    aqi1.setPm25_avg(53);
    aqi1.setPollutant("細懸浮微粒");
    aqi1.setPublishTime("2017-09-22 03:00");
    aqi1.setSo2(5.6);
    aqi1.setSiteName("二林");
    aqi1.setStatus("對敏感族群不良");
    aqi1.setWindDirec(14);
    aqi1.setWindSpeed(0.4);
    aqiList.add(aqi1);

    AQI aqi2 = new AQI();
    aqi2.setAqi(71);
    aqi2.setCo(0.22);
    aqi2.setCo_8hr(0.2);
    aqi2.setCounty("澎湖縣");
    aqi2.setNo(1.4);
    aqi2.setNo2(3.8);
    aqi2.setNox(5.1);
    aqi2.setO3(70);
    aqi2.setO3_8hr(61);
    aqi2.setPm10(40);
    aqi2.setPm10_avg(40);
    aqi2.setPm25(18);
    aqi2.setPm25_avg(22);
    aqi2.setPollutant("臭氧八小時");
    aqi2.setPublishTime("2017-09-22 03:00");
    aqi2.setSo2(2.4);
    aqi2.setSiteName("馬公");
    aqi2.setStatus("普通");
    aqi2.setWindDirec(23);
    aqi2.setWindSpeed(6.3);
    aqiList.add(aqi2);

    return aqiList;
  }


  @RequestMapping(value = "/aqi", method = RequestMethod.GET
      , produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "空氣品質指標(AQI)(單站)", notes="每小時提供各測站之空氣品質指標（AQI）" ,nickname = "AQI",response = AQI.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "成功"),
      @ApiResponse(code = 401, message = "拒絕存取"),
      @ApiResponse(code = 403, message = "禁止使用"),
      @ApiResponse(code = 404, message = "找不到"),
      @ApiResponse(code = 500, message = "內部伺服器錯誤")})
  public AQI aqi(@RequestParam(value="county", defaultValue="Erlin") String county) {
    AQI aqi = new AQI();

    aqi.setAqi(146);
    aqi.setCo(0.19);
    aqi.setCo_8hr(0.2);
    aqi.setCounty("彰化縣");
    aqi.setNo(0.7);
    aqi.setNo2(6.8);
    aqi.setNox(7.5);
    aqi.setO3(34);
    aqi.setO3_8hr(34);
    aqi.setPm10(87);
    aqi.setPm10_avg(81);
    aqi.setPm25(67);
    aqi.setPm25_avg(53);
    aqi.setPollutant("細懸浮微粒");
    aqi.setPublishTime("2017-09-22 03:00");
    aqi.setSo2(5.6);
    aqi.setSiteName("二林");
    aqi.setStatus("對敏感族群不良");
    aqi.setWindDirec(14);
    aqi.setWindSpeed(0.4);

    return aqi;
  }

  @RequestMapping(value = "/sites", method = RequestMethod.GET
      , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
  @ApiOperation(value = "空氣品質監測站基本資料(清單)"
      ,notes="1.環保署設於全國空氣品質監測站之基本資料；包括測站名稱、測站類別、座標、地址等。 2.測站位置圖層，以SHP圖層打包zip檔，包含DBF、SHP、SHX等地理圖資，供地理資訊系統套圖"
      ,nickname = "site"
      ,response = Site.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "成功"),
      @ApiResponse(code = 401, message = "拒絕存取"),
      @ApiResponse(code = 403, message = "禁止使用"),
      @ApiResponse(code = 404, message = "找不到"),
      @ApiResponse(code = 500, message = "內部伺服器錯誤")})
  public List<Site> sites() {
    List<Site> siteList = new ArrayList<>();
    Site site1 = new Site();
    site1.setSiteName("二林");
    site1.setSiteEngName("Erlin");
    site1.setAreaName("中部空品區");
    site1.setCounty("彰化縣");
    site1.setTownship("二林鎮");
    site1.setSiteAddres("彰化縣二林鎮江山巷1號");
    site1.setTwd97Lat(120.4096530000);
    site1.setTwd97Lat(23.9251750000);
    site1.setSiteType("一般測站");
    siteList.add(site1);

    Site site2 = new Site();
    site2.setSiteName("三重");
    site2.setSiteEngName("Sanchong");
    site2.setAreaName("北部空品區");
    site2.setCounty("新北市");
    site2.setTownship("三重區");
    site2.setSiteAddres("新北市三重區三和路與重陽路交口");
    site2.setTwd97Lat(121.4938060000);
    site2.setTwd97Lat(25.0726110000);
    site2.setSiteType("交通測站");
    siteList.add(site2);

    return siteList;
  }

  @RequestMapping(value = "/site", method = RequestMethod.GET
      , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
  @ApiOperation(value = "空氣品質監測站基本資料(單站)"
      ,notes="1.環保署設於全國空氣品質監測站之基本資料；包括測站名稱、測站類別、座標、地址等。 2.測站位置圖層，以SHP圖層打包zip檔，包含DBF、SHP、SHX等地理圖資，供地理資訊系統套圖"
      ,nickname = "site"
      ,response = Site.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "成功"),
      @ApiResponse(code = 401, message = "拒絕存取"),
      @ApiResponse(code = 403, message = "禁止使用"),
      @ApiResponse(code = 404, message = "找不到"),
      @ApiResponse(code = 500, message = "內部伺服器錯誤")})
  public Site site(@RequestParam(value="county", defaultValue="Erlin") String county) {
    Site site1 = new Site();
    site1.setSiteName("二林");
    site1.setSiteEngName("Erlin");
    site1.setAreaName("中部空品區");
    site1.setCounty("彰化縣");
    site1.setTownship("二林鎮");
    site1.setSiteAddres("彰化縣二林鎮江山巷1號");
    site1.setTwd97Lat(120.4096530000);
    site1.setTwd97Lat(23.9251750000);
    site1.setSiteType("一般測站");
    return site1;
  }



}
