
package com.cse.iitj.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "initials",
        "url",
        "image_100x100",
        "name",
        "title",
        "image_50x50",
        "_class",
        "display_name",
        "job_title"
})
public class VisibleInstructor {

    @JsonProperty("initials")
    private String initials;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image_100x100")
    private String image100x100;
    @JsonProperty("name")
    private String name;
    @JsonProperty("title")
    private String title;
    @JsonProperty("image_50x50")
    private String image50x50;
    @JsonProperty("_class")
    private String _class;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("job_title")
    private String jobTitle;

    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    @JsonProperty("initials")
    public void setInitials(String initials) {
        this.initials = initials;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("image_100x100")
    public String getImage100x100() {
        return image100x100;
    }

    @JsonProperty("image_100x100")
    public void setImage100x100(String image100x100) {
        this.image100x100 = image100x100;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("image_50x50")
    public String getImage50x50() {
        return image50x50;
    }

    @JsonProperty("image_50x50")
    public void setImage50x50(String image50x50) {
        this.image50x50 = image50x50;
    }

    @JsonProperty("_class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("_class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("job_title")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
