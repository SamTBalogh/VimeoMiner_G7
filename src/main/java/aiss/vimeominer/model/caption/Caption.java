package aiss.vimeominer.model.caption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Caption {

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("type")
    private String type;
    @JsonProperty("language")
    private String language;
    @JsonProperty("display_language")
    private String displayLanguage;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("link")
    private String link;
    @JsonProperty("link_expires_time")
    private Integer linkExpiresTime;
    @JsonProperty("hls_link")
    private String hlsLink;
    @JsonProperty("hls_link_expires_time")
    private Integer hlsLinkExpiresTime;
    @JsonProperty("name")
    private String name;

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("display_language")
    public String getDisplayLanguage() {
        return displayLanguage;
    }

    @JsonProperty("display_language")
    public void setDisplayLanguage(String displayLanguage) {
        this.displayLanguage = displayLanguage;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("link_expires_time")
    public Integer getLinkExpiresTime() {
        return linkExpiresTime;
    }

    @JsonProperty("link_expires_time")
    public void setLinkExpiresTime(Integer linkExpiresTime) {
        this.linkExpiresTime = linkExpiresTime;
    }

    @JsonProperty("hls_link")
    public String getHlsLink() {
        return hlsLink;
    }

    @JsonProperty("hls_link")
    public void setHlsLink(String hlsLink) {
        this.hlsLink = hlsLink;
    }

    @JsonProperty("hls_link_expires_time")
    public Integer getHlsLinkExpiresTime() {
        return hlsLinkExpiresTime;
    }

    @JsonProperty("hls_link_expires_time")
    public void setHlsLinkExpiresTime(Integer hlsLinkExpiresTime) {
        this.hlsLinkExpiresTime = hlsLinkExpiresTime;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Caption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("displayLanguage");
        sb.append('=');
        sb.append(((this.displayLanguage == null)?"<null>":this.displayLanguage));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("linkExpiresTime");
        sb.append('=');
        sb.append(((this.linkExpiresTime == null)?"<null>":this.linkExpiresTime));
        sb.append(',');
        sb.append("hlsLink");
        sb.append('=');
        sb.append(((this.hlsLink == null)?"<null>":this.hlsLink));
        sb.append(',');
        sb.append("hlsLinkExpiresTime");
        sb.append('=');
        sb.append(((this.hlsLinkExpiresTime == null)?"<null>":this.hlsLinkExpiresTime));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
