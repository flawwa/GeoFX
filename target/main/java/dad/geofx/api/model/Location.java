
package dad.geofx.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Location {

    @SerializedName("geoname_id")
    @Expose
    private Integer geonameId;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("languages")
    @Expose
    private List<Language> languages = new ArrayList<Language>();
    @SerializedName("country_flag")
    @Expose
    private String countryFlag;
    @SerializedName("country_flag_emoji")
    @Expose
    private String countryFlagEmoji;
    @SerializedName("country_flag_emoji_unicode")
    @Expose
    private String countryFlagEmojiUnicode;
    @SerializedName("calling_code")
    @Expose
    private String callingCode;
    @SerializedName("is_eu")
    @Expose
    private Boolean isEu;

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getCountryFlagEmoji() {
        return countryFlagEmoji;
    }

    public void setCountryFlagEmoji(String countryFlagEmoji) {
        this.countryFlagEmoji = countryFlagEmoji;
    }

    public String getCountryFlagEmojiUnicode() {
        return countryFlagEmojiUnicode;
    }

    public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
        this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public Boolean getIsEu() {
        return isEu;
    }

    public void setIsEu(Boolean isEu) {
        this.isEu = isEu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geonameId");
        sb.append('=');
        sb.append(((this.geonameId == null)?"<null>":this.geonameId));
        sb.append(',');
        sb.append("capital");
        sb.append('=');
        sb.append(((this.capital == null)?"<null>":this.capital));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("countryFlag");
        sb.append('=');
        sb.append(((this.countryFlag == null)?"<null>":this.countryFlag));
        sb.append(',');
        sb.append("countryFlagEmoji");
        sb.append('=');
        sb.append(((this.countryFlagEmoji == null)?"<null>":this.countryFlagEmoji));
        sb.append(',');
        sb.append("countryFlagEmojiUnicode");
        sb.append('=');
        sb.append(((this.countryFlagEmojiUnicode == null)?"<null>":this.countryFlagEmojiUnicode));
        sb.append(',');
        sb.append("callingCode");
        sb.append('=');
        sb.append(((this.callingCode == null)?"<null>":this.callingCode));
        sb.append(',');
        sb.append("isEu");
        sb.append('=');
        sb.append(((this.isEu == null)?"<null>":this.isEu));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.callingCode == null)? 0 :this.callingCode.hashCode()));
        result = ((result* 31)+((this.capital == null)? 0 :this.capital.hashCode()));
        result = ((result* 31)+((this.countryFlagEmoji == null)? 0 :this.countryFlagEmoji.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.geonameId == null)? 0 :this.geonameId.hashCode()));
        result = ((result* 31)+((this.countryFlag == null)? 0 :this.countryFlag.hashCode()));
        result = ((result* 31)+((this.countryFlagEmojiUnicode == null)? 0 :this.countryFlagEmojiUnicode.hashCode()));
        result = ((result* 31)+((this.isEu == null)? 0 :this.isEu.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return (((((((((this.callingCode == rhs.callingCode)||((this.callingCode!= null)&&this.callingCode.equals(rhs.callingCode)))&&((this.capital == rhs.capital)||((this.capital!= null)&&this.capital.equals(rhs.capital))))&&((this.countryFlagEmoji == rhs.countryFlagEmoji)||((this.countryFlagEmoji!= null)&&this.countryFlagEmoji.equals(rhs.countryFlagEmoji))))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.geonameId == rhs.geonameId)||((this.geonameId!= null)&&this.geonameId.equals(rhs.geonameId))))&&((this.countryFlag == rhs.countryFlag)||((this.countryFlag!= null)&&this.countryFlag.equals(rhs.countryFlag))))&&((this.countryFlagEmojiUnicode == rhs.countryFlagEmojiUnicode)||((this.countryFlagEmojiUnicode!= null)&&this.countryFlagEmojiUnicode.equals(rhs.countryFlagEmojiUnicode))))&&((this.isEu == rhs.isEu)||((this.isEu!= null)&&this.isEu.equals(rhs.isEu))));
    }

}
