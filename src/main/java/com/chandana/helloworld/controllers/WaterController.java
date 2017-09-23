package com.chandana.helloworld.controllers;

import com.chandana.helloworld.bean.AQI;
import com.chandana.helloworld.bean.Reservoir;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/water")
@Api(value = "Water", description = "環保署水 Open API", tags = "水API")
public class WaterController {


  @RequestMapping(value = "/reservoirs", method = RequestMethod.GET
      , produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "水庫水質監測點基本資料(清單)", notes="環保署發布水庫水質監測點基本資料，包括各測點地理環境位置等資料。本項資料為視監測計畫需求不定期更新" ,nickname = "reservoirs",response = Reservoir.class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "成功"),
      @ApiResponse(code = 401, message = "拒絕存取"),
      @ApiResponse(code = 403, message = "禁止使用"),
      @ApiResponse(code = 404, message = "找不到"),
      @ApiResponse(code = 500, message = "內部伺服器錯誤")})
  public List<Reservoir> reservoirs() {
    List<Reservoir> entityList = new ArrayList<>();

    Reservoir entity1 = new Reservoir();
    entity1.setSiteName("七美水庫");
    entity1.setSiteEngName("Chi-Mei Reservoir I");
    entity1.setCounty("澎湖縣");
    entity1.setTownship("七美鄉");
    entity1.setDamName("七美水庫");
    entity1.setDamRank("離島");
    entity1.setTwd97Lat(119.4345620);
    entity1.setTwd97Lon(23.2117290);
    entity1.setTwd97TM2x(90392.74);
    entity1.setTwd97TM2y(2568522.55);
    entity1.setSiteAddress("澎湖縣七美鄉");
    entity1.setStatusOfUse("啟用");
    entityList.add(entity1);

    Reservoir entity2 = new Reservoir();
    entity2.setSiteName("大埔水庫");
    entity2.setSiteEngName("Ta-Pu Reservoir");
    entity2.setCounty("新竹縣");
    entity2.setTownship("峨眉鄉");
    entity2.setDamName("大埔水庫");
    entity2.setDamRank("本島次要");
    entity2.setTwd97Lat(120.9837520);
    entity2.setTwd97Lon(24.6759130);
    entity2.setTwd97TM2x(248355.69);
    entity2.setTwd97TM2y(2729882.03);
    entity2.setSiteAddress("新竹縣峨嵋鄉");
    entity2.setStatusOfUse("啟用");
    entityList.add(entity2);

    return entityList;
  }

}
