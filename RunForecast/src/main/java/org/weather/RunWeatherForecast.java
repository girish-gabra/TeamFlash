package org.weather;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by girish on 9/19/16.
 */
@Path("/run")
public class RunWeatherForecast {

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public String runForecast(@QueryParam("location") String locationName)
    {
        if(locationName==null || locationName.length()==0 ){
            throw new IllegalArgumentException();
        }

        doCapactiyTesting();
        Location location = new Location();
        location.setLocationName(locationName);
        location.setTemperature(10.0);
        location.setWindSpeed(12.5);
        Gson gson =  new Gson();
        //System.out.println("Before fun call");
        // LocationDAO locationDAO = new LocationDAO();
        // locationDAO.getWeatherInfo(locationid);
        return gson.toJson(location);
    }

    private void doCapactiyTesting()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int result=0;
        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            list.add(Integer.MAX_VALUE);
            result+=Math.pow(i,10000);
            if(result%5==0)
            {
                System.out.println("Divisible by 5");
            }
        }

        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            list.remove(0);
        }
    }
}
