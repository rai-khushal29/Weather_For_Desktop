/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Weather;
/**
 *
 * @author khushal
 */
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
@GET("data/2.5/weather")
Call<WeatherModel> getCurrentCityWeatherInfo(@Query("q") String city_name,
        @Query("appid") String appid,
        @Query("units") String units);

}