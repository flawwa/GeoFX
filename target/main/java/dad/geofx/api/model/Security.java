
package dad.geofx.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Security {

    @SerializedName("is_proxy")
    @Expose
    private Boolean isProxy;
    @SerializedName("proxy_type")
    @Expose
    private Object proxyType;
    @SerializedName("is_crawler")
    @Expose
    private Boolean isCrawler;
    @SerializedName("crawler_name")
    @Expose
    private Object crawlerName;
    @SerializedName("crawler_type")
    @Expose
    private Object crawlerType;
    @SerializedName("is_tor")
    @Expose
    private Boolean isTor;
    @SerializedName("threat_level")
    @Expose
    private String threatLevel;
    @SerializedName("threat_types")
    @Expose
    private List<Object> threatTypes = new ArrayList<Object>();

    public Boolean getIsProxy() {
        return isProxy;
    }

    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    public Object getProxyType() {
        return proxyType;
    }

    public void setProxyType(Object proxyType) {
        this.proxyType = proxyType;
    }

    public Boolean getIsCrawler() {
        return isCrawler;
    }

    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    public Object getCrawlerName() {
        return crawlerName;
    }

    public void setCrawlerName(Object crawlerName) {
        this.crawlerName = crawlerName;
    }

    public Object getCrawlerType() {
        return crawlerType;
    }

    public void setCrawlerType(Object crawlerType) {
        this.crawlerType = crawlerType;
    }

    public Boolean getIsTor() {
        return isTor;
    }

    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public List<Object> getThreatTypes() {
        return threatTypes;
    }

    public void setThreatTypes(List<Object> threatTypes) {
        this.threatTypes = threatTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Security.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isProxy");
        sb.append('=');
        sb.append(((this.isProxy == null)?"<null>":this.isProxy));
        sb.append(',');
        sb.append("proxyType");
        sb.append('=');
        sb.append(((this.proxyType == null)?"<null>":this.proxyType));
        sb.append(',');
        sb.append("isCrawler");
        sb.append('=');
        sb.append(((this.isCrawler == null)?"<null>":this.isCrawler));
        sb.append(',');
        sb.append("crawlerName");
        sb.append('=');
        sb.append(((this.crawlerName == null)?"<null>":this.crawlerName));
        sb.append(',');
        sb.append("crawlerType");
        sb.append('=');
        sb.append(((this.crawlerType == null)?"<null>":this.crawlerType));
        sb.append(',');
        sb.append("isTor");
        sb.append('=');
        sb.append(((this.isTor == null)?"<null>":this.isTor));
        sb.append(',');
        sb.append("threatLevel");
        sb.append('=');
        sb.append(((this.threatLevel == null)?"<null>":this.threatLevel));
        sb.append(',');
        sb.append("threatTypes");
        sb.append('=');
        sb.append(((this.threatTypes == null)?"<null>":this.threatTypes));
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
        result = ((result* 31)+((this.isTor == null)? 0 :this.isTor.hashCode()));
        result = ((result* 31)+((this.threatTypes == null)? 0 :this.threatTypes.hashCode()));
        result = ((result* 31)+((this.crawlerType == null)? 0 :this.crawlerType.hashCode()));
        result = ((result* 31)+((this.proxyType == null)? 0 :this.proxyType.hashCode()));
        result = ((result* 31)+((this.crawlerName == null)? 0 :this.crawlerName.hashCode()));
        result = ((result* 31)+((this.isCrawler == null)? 0 :this.isCrawler.hashCode()));
        result = ((result* 31)+((this.isProxy == null)? 0 :this.isProxy.hashCode()));
        result = ((result* 31)+((this.threatLevel == null)? 0 :this.threatLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security) == false) {
            return false;
        }
        Security rhs = ((Security) other);
        return (((((((((this.isTor == rhs.isTor)||((this.isTor!= null)&&this.isTor.equals(rhs.isTor)))&&((this.threatTypes == rhs.threatTypes)||((this.threatTypes!= null)&&this.threatTypes.equals(rhs.threatTypes))))&&((this.crawlerType == rhs.crawlerType)||((this.crawlerType!= null)&&this.crawlerType.equals(rhs.crawlerType))))&&((this.proxyType == rhs.proxyType)||((this.proxyType!= null)&&this.proxyType.equals(rhs.proxyType))))&&((this.crawlerName == rhs.crawlerName)||((this.crawlerName!= null)&&this.crawlerName.equals(rhs.crawlerName))))&&((this.isCrawler == rhs.isCrawler)||((this.isCrawler!= null)&&this.isCrawler.equals(rhs.isCrawler))))&&((this.isProxy == rhs.isProxy)||((this.isProxy!= null)&&this.isProxy.equals(rhs.isProxy))))&&((this.threatLevel == rhs.threatLevel)||((this.threatLevel!= null)&&this.threatLevel.equals(rhs.threatLevel))));
    }

}
