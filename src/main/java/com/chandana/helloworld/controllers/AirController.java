package com.chandana.helloworld.controllers;

import com.chandana.helloworld.bean.AQI;
import com.chandana.helloworld.bean.Site;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/air_api")
@Api(value = "EPA", description = "環保署空氣品質Open Data", tags = "大氣 API")
public class AirController {

  @RequestMapping(value = "/currentAQI", method = RequestMethod.GET
      , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
  @ApiOperation(value = "空氣品質指標(AQI)", notes="每小時提供各測站之空氣品質指標（AQI）" ,nickname = "AQI",response = AQI.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "OK"),
      @ApiResponse(code = 404, message = "The resource not found")
  }
  )
  public AQI currentAQI() {
    AQI aqi = new AQI();

    aqi.setAqi(146);
    aqi.setCo(0.19);
    aqi.setCo_8hr(0.2);
    aqi.setCountry("彰化縣");
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
  @ApiOperation(value = "空氣品質監測站基本資料"
      ,notes="1.環保署設於全國空氣品質監測站之基本資料；包括測站名稱、測站類別、座標、地址等。 2.測站位置圖層，以SHP圖層打包zip檔，包含DBF、SHP、SHX等地理圖資，供地理資訊系統套圖"
      ,nickname = "site"
      ,response = Site.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "OK"),
      @ApiResponse(code = 404, message = "The resource not found")
  }
  )
  public Site sites() {
    Site site = new Site();
    return site;
  }



}
