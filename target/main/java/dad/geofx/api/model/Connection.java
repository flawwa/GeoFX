
package dad.geofx.api.model;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Connection {

    @SerializedName("asn")
    @Expose
    private Integer asn;
    @SerializedName("isp")
    @Expose
    private String isp;

    public Integer getAsn() {
        return asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Connection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asn");
        sb.append('=');
        sb.append(((this.asn == null)?"<null>":this.asn));
        sb.append(',');
        sb.append("isp");
        sb.append('=');
        sb.append(((this.isp == null)?"<null>":this.isp));
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
        result = ((result* 31)+((this.asn == null)? 0 :this.asn.hashCode()));
        result = ((result* 31)+((this.isp == null)? 0 :this.isp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return (((this.asn == rhs.asn)||((this.asn!= null)&&this.asn.equals(rhs.asn)))&&((this.isp == rhs.isp)||((this.isp!= null)&&this.isp.equals(rhs.isp))));
    }

}
