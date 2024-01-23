package dad.geofx.api;

import dad.geofx.api.model.Ipapi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GeoIPAPI {
	
	@GET("ip_api.php")
    Call<Ipapi> obtenerInformacionGeoIpapi(@Query("ip") String ip);

}
