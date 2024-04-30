
package aiss.vimeominer.model.VimeoMiner.video;


import aiss.vimeominer.model.VimeoMiner.caption.VimeoCaption;
import aiss.vimeominer.model.VimeoMiner.comment.VimeoComment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VimeoVideo {

    @JsonProperty("uri")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("release_time")
    private String releaseTime;
    @JsonProperty("release_time")
    private List<VimeoCaption> captionList;
    @JsonProperty("release_time")
    private List<VimeoComment> commentsList;

    @JsonProperty("uri")
    public String getId() {
        return id;
    }

    @JsonProperty("uri")
    public void setId(String uri) {
        this.id = uri.replace("/videos/", "");
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("release_time")
    public String getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("release_time")
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    @JsonProperty("comments")
    public List<VimeoComment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<VimeoComment> commentsList) {
        this.commentsList = commentsList;
    }

    public List<VimeoCaption> getCaptionList() {
        return captionList;
    }

    public void setCaptionList(List<VimeoCaption> captionList) {
        this.captionList = captionList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VimeoVideo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("releaseTime");
        sb.append('=');
        sb.append(((this.releaseTime == null)?"<null>":this.releaseTime));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
