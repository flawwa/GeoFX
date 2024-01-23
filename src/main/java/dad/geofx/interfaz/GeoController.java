package dad.geofx.interfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.api.GeoService;
import dad.geofx.api.model.Ipapi;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class GeoController implements Initializable {

	@FXML
	private Label IPAdress;

    @FXML
    private ImageView securityImage;

	@FXML
	private ImageView wifiicon;
	
	@FXML
	private ImageView securityImg;

	@FXML
	private Label Potential;

	@FXML
	private Label altitude;

	@FXML
	private Label asn;

	@FXML
	private ImageView bandera;

	@FXML
	private Label callingCode;

	@FXML
	private Label cityState;

	@FXML
	private Label currency;

	@FXML
	private Label hostname;

	@FXML
	private Label languajeLabel;

	@FXML
	private Label longitude;

	@FXML
	private Label pLocation;

	@FXML
	private Label timeZone;

	@FXML
	private Label type;

	@FXML
	private TextField verIP;
	
    @FXML
    private CheckBox isCrawler;

    @FXML
    private CheckBox isProxy;

    @FXML
    private CheckBox isThreat;

    @FXML
    private CheckBox isTop;

	@FXML
	private BorderPane view;

	@FXML
	private Label zipCode;

	private final GeoService apiService;
	


	public GeoController(GeoService apiService) {
		this.apiService = apiService;

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeoView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public BorderPane getView() {
		return view;
	}
	
	Image wifiicon1 = new Image("/imgicons/Wifi-icon.png");
	Image securityImage1 = new Image("/imgicons/Network-Shield-icon.png");
	Image securityImg1 = new Image("/imgicons/Globe-icon.png");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		wifiicon.setImage(wifiicon1);
		securityImage.setImage(securityImg1);
		securityImg.setImage(securityImage1);
	}

	@FXML
	void onVerIP(ActionEvent event) {
		String ipAddress = verIP.getText();

		// Para Ipify
		Task<Ipapi> task = new Task<Ipapi>() {
			protected Ipapi call() throws Exception {
				return apiService.obtenerInformacionGeoIpapi(ipAddress);
			}
		};
		task.setOnSucceeded(eventTask -> {
			Ipapi result = task.getValue();
			actualizarInterfazUsuario(result);
		});
		task.setOnFailed(eventTask -> eventTask.getSource().getException().printStackTrace());
		new Thread(task).start();

	}

	private void actualizarInterfazUsuario(Ipapi myApiResponse) {
		Platform.runLater(() -> {
			if (myApiResponse != null && myApiResponse.getLocation() != null) {
				altitude.setText(myApiResponse.getLatitude().toString());
				System.out.println(myApiResponse.getLatitude().toString());
				callingCode.setText(myApiResponse.getLocation().getCallingCode());
				cityState.setText(myApiResponse.getCity().toString());
				currency.setText(String.valueOf(myApiResponse.getCurrency().getName()).toString());
				languajeLabel.setText(myApiResponse.getCountryName() + myApiResponse.getCountryCode());
				longitude.setText(myApiResponse.getLongitude().toString());
				pLocation.setText(String.valueOf(myApiResponse.getLocation().getCapital()));
				timeZone.setText(myApiResponse.getTimeZone().getCurrentTime().toString());
				zipCode.setText(myApiResponse.getZip());
				
				IPAdress.setText(myApiResponse.getIp());
				asn.setText(String.valueOf(myApiResponse.getConnection().getAsn()));
				type.setText(myApiResponse.getType());
				hostname.setText(myApiResponse.getHostname());
				myApiResponse.getSecurity().getProxyType();
				
				isProxy.setSelected(myApiResponse.getSecurity().getIsProxy());
				isCrawler.setSelected(myApiResponse.getSecurity().getIsCrawler());
				//isThreat.setSelected(myApiResponse.getSecurity().getThreatTypes());
				isTop.setSelected(myApiResponse.getSecurity().getIsTor());
				

				Image flags = new Image(
						getClass().getResourceAsStream("/flag-icons/64x42/" + myApiResponse.getCountryCode() + ".png"));
				bandera.setImage(flags);

			} else {
				System.out.println("Respuesta de la API o ubicación nula");
			}
		});
	}

}
