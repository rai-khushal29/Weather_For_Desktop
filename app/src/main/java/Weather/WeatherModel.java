/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weather;

import java.util.ArrayList;

/**
 *
 * @author khushal
 */
public class WeatherModel {
    objCoord coord;
    ArrayList<weather> weather = new ArrayList<>();
    String base;
    objMain main;
    String visibility;
    objWind wind;
    objClouds clouds;
    String dt;
    objSys sys;
    String timezone;
    String id;
    String name;
    String cod;
    String message;
    String cnt;
    ArrayList<list> list = new ArrayList<>();
    objCity city;
    
    public WeatherModel(objCoord coord, ArrayList<weather> weather, String base, 
            objMain main, String visibility,objWind wind, objClouds clouds, String dt, objSys sys, String timezone, 
            String id, String name, 
            String cod, String message, String cnt,  ArrayList<list> list,objCity city )
    {
       this.coord=coord;
       this.weather=weather;
       this.base=base;
       this.main=main;
       this.visibility=visibility;
       this.wind=wind;
       this.clouds=clouds;
       this.dt=dt;
       this.sys=sys;
       this.timezone=timezone;
       this.id=id;
       this.name=name;
       this.cod=cod;
       this.message=message;
       this.cnt=cnt;
       this.list=list;
       this.city=city;
        
    }
    
    class weather{
    String id;
    String main;
    String description;
    String icon;
   public weather(String id,String main, String description, String icon)
   {
       this.id=id;
       this.main=main;
       this.description=description;
       this.icon=icon;
   }
}
    class list{
    String dt,visibility,pop,dt_txt;
    objMain main;
    ArrayList<weather> weather = new ArrayList<>();
    objClouds clouds;
    objWind wind;
    objSys sys;
    public list(String dt, objMain main, ArrayList<weather> weather, 
            objClouds clouds, objWind wind, String visibility, 
            String pop, objSys sys, String dt_txt)
    {
        this.dt=dt;
        this.main=main;
        this.weather=weather;
        this.clouds=clouds;
        this.wind=wind;
        this.visibility=visibility;
        this.pop=pop;
        this.sys=sys;
        this.dt_txt=dt_txt;
    }
}
   
    class objCoord{
    String lon;
    String lat;
    public objCoord(String lon,String lat)
    {
        this.lat=lat;
        this.lon=lon;
    }
}
    class objClouds{
    String all;
    public objClouds(String all)
    {
        this.all=all;
    }
}
    class objWind{
    String speed;
    String deg;
    String gust;
    public objWind(String speed, String deg, String gust)
    {
        this.speed=speed;
        this.deg=deg;
        this.gust=gust;
    }
}
    class objSys{
    String country;
    String sunrise;
    String sunset;
public objSys(String country, String sunrise, String sunset)
{
    this.country=country;
    this.sunrise=sunrise;
    this.sunset=sunset;
}
}
    class objCity{
    String id,country,population,timezone,sunrise,sunset;
    objCoord coord;
    public objCity(String id, objCoord coord, String country, String population, String timezone,
            String sunrise, String sunset)
    {
        this.id=id;
        this.coord=coord;
        this.country=country;
        this.population=population;
        this.timezone=timezone;
        this.sunrise=sunrise;
        this.sunset=sunset;
    }
}
} // End of Main Class

 class objMain{
    String temp;
    String feels_like;
    String temp_min;
    String temp_max;
    String pressure;
    String humidity;
    String sea_level;
    String grnd_level;
    public objMain(String temp, String feels_like, String temp_min, String temp_max,
            String pressure, String humidity, String sea_level, String grnd_level)
    {
        this.temp=temp;
        this.feels_like=feels_like;
        this.temp_min=temp_min;
        this.temp_max=temp_max;
        this.pressure=pressure;
        this.humidity=humidity;
        this.sea_level=sea_level;
        this.grnd_level=grnd_level;
    }
}










