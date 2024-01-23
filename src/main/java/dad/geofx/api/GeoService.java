package dad.geofx.api;

import java.io.IOException;

import dad.geofx.api.model.Ipapi;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoService {

    private GeoIPAPI geoServiceIpapi;
    //private GeoIPAPI geoServiceIpify;

    public GeoService() {
        Retrofit retrofitIpapi = new Retrofit.Builder()
                .baseUrl("https://ipapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        geoServiceIpapi = retrofitIpapi.create(GeoIPAPI.class);

    }

    public Ipapi obtenerInformacionGeoIpapi(String ipAddress) throws IOException {
    	Call<Ipapi> call = geoServiceIpapi.obtenerInformacionGeoIpapi(ipAddress);
		
		Response<Ipapi> response = call.execute();
		
		return response.body();
    }

    
}
